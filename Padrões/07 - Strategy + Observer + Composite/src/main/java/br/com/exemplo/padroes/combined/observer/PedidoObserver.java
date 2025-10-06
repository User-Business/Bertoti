package br.com.exemplo.padroes.combined.observer;

import br.com.exemplo.padroes.combined.app.Pedido;

public interface PedidoObserver {
    void onAtualizado(Pedido p);
}
