package br.com.altave.api.controller;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.altave.api.model.Funcionario;
import br.com.altave.api.service.FuncionarioService;

@RestController
@RequestMapping("/api/funcionarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FuncionarioController {

    private final FuncionarioService service;
    private final Path uploadDir;

    public FuncionarioController(FuncionarioService service, @Value("${file.upload-dir}") String uploadDirPath) {
        this.service = service;
        this.uploadDir = Paths.get(uploadDirPath);
    }

    // Listar todos os funcionários
    @GetMapping
    public List<Funcionario> listarTodos() {
        return service.listarTodos();
    }

    // Buscar funcionário por ID
    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Criar um novo funcionário
    @PostMapping
    public Funcionario salvar(@RequestBody Funcionario funcionario) {
        return service.salvar(funcionario);
    }

    // Atualizar um funcionário existente
    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> atualizar(@PathVariable Long id, @RequestBody Funcionario funcionarioAtualizado) {
        return service.atualizar(id, funcionarioAtualizado)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Deletar um funcionário
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    // Upload de imagem
    @PostMapping("/{id}/imagem")
    public ResponseEntity<String> uploadImagem(@PathVariable Long id, @RequestParam("file") MultipartFile file) {
        try {
            String imageUrl = service.salvarImagem(id, file);
            if (imageUrl != null) {
                return ResponseEntity.ok("Imagem salva com sucesso: " + imageUrl);
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Funcionário não encontrado");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao salvar a imagem");
        }
    }

    // Recuperar a URL da imagem por ID
    @GetMapping("/{id}/imagem")
    public ResponseEntity<String> getImagem(@PathVariable Long id) {
        try {
            String imageUrl = service.recuperarImagem(id);
            if (imageUrl != null) {
                return ResponseEntity.ok(imageUrl); // Retorna a URL da imagem
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    // Servir a imagem pelo nome do arquivo
    @GetMapping("/uploads/{filename:.+}")
    public ResponseEntity<Resource> serveFile(@PathVariable String filename) {
        try {
            Path file = uploadDir.resolve(filename);
            Resource resource = new UrlResource(file.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + resource.getFilename() + "\"")
                        .contentType(MediaType.IMAGE_JPEG)
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}