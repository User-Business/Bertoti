package br.com.exemplo.padroes.antiobserver;

public class DashboardVendas {
    public void atualizar(Pedido p) {
        System.out.println("[DASHBOARD] Atualiza gráficos para " + p.getCodigo());
    }
}
