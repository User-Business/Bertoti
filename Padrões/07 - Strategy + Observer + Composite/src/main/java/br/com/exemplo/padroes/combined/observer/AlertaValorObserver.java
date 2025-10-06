package br.com.exemplo.padroes.combined.observer;

import br.com.exemplo.padroes.combined.app.Pedido;

public class AlertaValorObserver implements PedidoObserver {
    private final double limite;
    public AlertaValorObserver(double limite) { this.limite = limite; }
    @Override public void onAtualizado(Pedido p) {
        if (p.getTotalComFrete() >= limite) {
            System.out.println("[ALERTA] Pedido atingiu limite de " + limite + ": " + p.getTotalComFrete());
        }
    }
}
