package br.com.exemplo.padroes.antiobserver;

public class SistemaPedidos {
    private final NotificadorEmailGerente email = new NotificadorEmailGerente();
    private final DashboardVendas dashboard = new DashboardVendas();
    private final LogAuditoria log = new LogAuditoria();

    public void criarPedido(Pedido p) {
        // regras...
        // acoplado às implementações:
        email.enviar(p);
        dashboard.atualizar(p);
        log.registrar(p);
    }
}
