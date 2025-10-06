package br.com.exemplo.padroes.antiobserver;

public class Main {
    public static void main(String[] args) {
        SistemaPedidos s = new SistemaPedidos();
        s.criarPedido(new Pedido("P-001", 199.90));
    }
}
