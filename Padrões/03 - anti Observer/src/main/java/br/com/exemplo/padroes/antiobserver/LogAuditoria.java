package br.com.exemplo.padroes.antiobserver;

public class LogAuditoria {
    public void registrar(Pedido p) {
        System.out.println("[AUDITORIA] Pedido " + p.getCodigo() + " valor=" + p.getValor());
    }
}
