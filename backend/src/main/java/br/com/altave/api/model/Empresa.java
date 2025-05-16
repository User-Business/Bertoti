package br.com.altave.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @Column(nullable = false, unique=true)
    private String cnpj;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String endereco;

    // Construtores 
    public Empresa() {}

    public Empresa(String cnpj, String nome, String endereco) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
    }

    //Getters e Setters
    public String getCnpj() {return cnpj;}
    public void setCnpj(String cnpj) {this.cnpj = cnpj;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
}
