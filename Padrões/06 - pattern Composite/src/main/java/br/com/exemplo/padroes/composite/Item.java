package br.com.exemplo.padroes.composite;

public class Item implements ComponentePedido {
    private final String nome;
    private final double peso;
    private final double preco;
    public Item(String nome, double peso, double preco) {
        this.nome = nome; this.peso = peso; this.preco = preco;
    }
    @Override public double getPesoTotal() { return peso; }
    @Override public double getPrecoTotal() { return preco; }
    @Override public String getNome() { return nome; }
}
