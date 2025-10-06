package br.com.exemplo.padroes.combined.observer;

import br.com.exemplo.padroes.combined.app.Pedido;

public class LoggerObserver implements PedidoObserver {
    @Override public void onAtualizado(Pedido p) {
        System.out.println("[LOG] Total=" + p.getTotalComFrete() + " Frete=" + p.getValorFrete());
    }
}
