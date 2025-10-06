package br.com.exemplo.padroes.observer;

public class DashboardVendas implements PedidoObserver {
    @Override
    public void onPedidoCriado(Pedido p) {
        System.out.println("[DASHBOARD] Atualiza gráficos para " + p.getCodigo());
    }
}
