package br.com.exemplo.padroes.observer;

public class NotificadorEmailGerente implements PedidoObserver {
    @Override
    public void onPedidoCriado(Pedido p) {
        System.out.println("[EMAIL] Gerente: novo pedido " + p.getCodigo());
    }
}
