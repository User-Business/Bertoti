package br.com.exemplo.padroes.anticomposite;

import java.util.ArrayList;
import java.util.List;

public class Pacote {
    private final String nome;
    private final List<Item> itens = new ArrayList<>();
    public Pacote(String nome) { this.nome = nome; }
    public void add(Item i) { itens.add(i); }
    public List<Item> getItens() { return itens; }
    public String getNome() { return nome; }
}
