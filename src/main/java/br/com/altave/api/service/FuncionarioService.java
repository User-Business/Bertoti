package br.com.altave.api.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.altave.api.model.Funcionario;
import br.com.altave.api.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Value("${file.upload-dir}")
    private String uploadDir;

    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    // Salvar imagem de um funcionário
    public String salvarImagem(Long id, MultipartFile file) {
        return repository.findById(id).map(funcionario -> {
            try {
                File directory = new File(uploadDir);
                if (!directory.exists()) {
                    directory.mkdirs();
                }

                String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
                Path path = Paths.get(uploadDir, fileName);

                Files.copy(file.getInputStream(), path);

                // Gera a URL relativa correta
                String fileUrl = "/api/funcionarios/uploads/" + fileName;

                // Salva a URL no banco de dados
                funcionario.setImagem(fileUrl);
                repository.save(funcionario);

                return fileUrl;
            } catch (IOException e) {
                throw new RuntimeException("Erro ao salvar a imagem", e);
            }
        }).orElse(null);
    }

    // Recuperar URL da imagem de um funcionário
    public String recuperarImagem(Long id) {
        return repository.findById(id).map(Funcionario::getImagem).orElse(null);
    }

    // Listar todos os funcionários
    public List<Funcionario> listarTodos() {
        return repository.findAll();
    }

    // Buscar funcionário por ID
    public Optional<Funcionario> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Salvar um novo funcionário
    public Funcionario salvar(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    // Atualizar um funcionário existente
    public Optional<Funcionario> atualizar(Long id, Funcionario funcionarioAtualizado) {
        return repository.findById(id).map(funcionario -> {
            funcionario.setNome(funcionarioAtualizado.getNome());
            funcionario.setCpf(funcionarioAtualizado.getCpf());
            funcionario.setEmpresa(funcionarioAtualizado.getEmpresa());
            funcionario.setFuncao(funcionarioAtualizado.getFuncao());
            funcionario.setEmail(funcionarioAtualizado.getEmail());
            return repository.save(funcionario);
        });
    }

    // Deletar um funcionário
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}