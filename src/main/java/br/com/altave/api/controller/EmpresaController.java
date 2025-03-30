package br.com.altave.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.altave.api.model.Empresa;
import br.com.altave.api.service.EmpresaService;

@RestController
@RequestMapping("/api/empresa")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmpresaController {
    private final EmpresaService service;

    public EmpresaController(EmpresaService service) {
        this.service = service;
    }

    // Listar todas as empresas
    @GetMapping
    public List<Empresa> listarTodos() {
        return service.listarTodos();
    }

    // Buscar empresa por CNPJ
    @GetMapping("/{cnpj}")
    public ResponseEntity<Empresa> buscarPorCnpj(@PathVariable String cnpj) {
        return service.buscarPorCnpj(cnpj)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Criar uma nova empresa
    @PostMapping
    public Empresa salvar(@RequestBody Empresa empresa) {
        return service.salvar(empresa);
    }

    // Atualizar uma empresa existente
    @PutMapping("/{cnpj}")
    public ResponseEntity<Empresa> atualizar(@PathVariable String cnpj, @RequestBody Empresa empresaAtualizada) {
        return service.atualizar(cnpj, empresaAtualizada)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Deletar uma empresa
    @DeleteMapping("/{cnpj}")
    public ResponseEntity<Void> deletar(@PathVariable String cnpj) {
        service.deletar(cnpj);
        return ResponseEntity.noContent().build();
    }
}