package br.com.exemplo.padroes.antiobserver;

public class Pedido {
    private final String codigo;
    private final double valor;
    public Pedido(String codigo, double valor) { this.codigo = codigo; this.valor = valor; }
    public String getCodigo() { return codigo; }
    public double getValor() { return valor; }
}
