package br.com.altave.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.altave.api.model.Empresa;
import br.com.altave.api.repository.EmpresaRepository;

@Service
public class EmpresaService {
    private final EmpresaRepository repository;
    
    public EmpresaService(EmpresaRepository repository){
        this.repository = repository;
    }

    //Listar todas as empresas
    public List<Empresa> listarTodos() {
        return repository.findAll();
    }   

    //Buscar empresa por cnpj
    public Optional<Empresa> buscarPorCnpj(String cnpj){
        return repository.findById(cnpj);
    }

    //Salvar uma nova empresa
    public Empresa salvar(Empresa empresa) {
        return repository.save(empresa);
    }

    //Atualizar uma empresa existente
    public Optional<Empresa> atualizar(String cnpj, Empresa empresaAtualizada){
        return repository.findById(cnpj).map(empresa -> {
            empresa.setNome(empresaAtualizada.getNome());
            empresa.setEndereco(empresaAtualizada.getEndereco());
            return repository.save(empresa);
        });
    }

    //Deletar uma empresa
    public void deletar(String cnpj){
        repository.deleteById(cnpj);
    }
}
