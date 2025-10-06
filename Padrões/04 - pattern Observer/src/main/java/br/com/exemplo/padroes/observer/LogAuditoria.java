package br.com.exemplo.padroes.observer;

public class LogAuditoria implements PedidoObserver {
    @Override
    public void onPedidoCriado(Pedido p) {
        System.out.println("[AUDITORIA] Pedido " + p.getCodigo() + " valor=" + p.getValor());
    }
}
