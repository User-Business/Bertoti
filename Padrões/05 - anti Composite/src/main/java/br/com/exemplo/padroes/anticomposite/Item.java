package br.com.exemplo.padroes.anticomposite;

public class Item {
    private final String nome;
    private final double peso;
    private final double preco;
    public Item(String nome, double peso, double preco) {
        this.nome = nome; this.peso = peso; this.preco = preco;
    }
    public double getPeso() { return peso; }
    public double getPreco() { return preco; }
    public String getNome() { return nome; }
}
