package br.com.exemplo.padroes.antiobserver;

public class NotificadorEmailGerente {
    public void enviar(Pedido p) {
        System.out.println("[EMAIL] Gerente: novo pedido " + p.getCodigo());
    }
}
