package br.com.exemplo.padroes.observer;

public class Main {
    public static void main(String[] args) {
        PedidoEventSource source = new PedidoEventSource();
        source.addObserver(new NotificadorEmailGerente());
        source.addObserver(new DashboardVendas());
        source.addObserver(new LogAuditoria());
        source.criarPedido(new Pedido("P-002", 349.00));
    }
}
