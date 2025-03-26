package br.com.altave.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.altave.api.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
