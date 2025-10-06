package br.com.exemplo.padroes.combined.composite;

import java.util.ArrayList;
import java.util.List;

public class Pacote implements ComponentePedido {
    private final String nome;
    private final List<ComponentePedido> filhos = new ArrayList<>();
    public Pacote(String nome) { this.nome = nome; }
    public void add(ComponentePedido c) { filhos.add(c); }
    public void remove(ComponentePedido c) { filhos.remove(c); }
    @Override public double getPesoTotal() {
        return filhos.stream().mapToDouble(ComponentePedido::getPesoTotal).sum();
    }
    @Override public double getPrecoTotal() {
        return filhos.stream().mapToDouble(ComponentePedido::getPrecoTotal).sum();
    }
    @Override public String getNome() { return nome; }
    public List<ComponentePedido> getFilhos() { return filhos; }
}
