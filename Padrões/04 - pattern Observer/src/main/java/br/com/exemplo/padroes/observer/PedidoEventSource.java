package br.com.exemplo.padroes.observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoEventSource {
    private final List<PedidoObserver> observers = new ArrayList<>();

    public void addObserver(PedidoObserver o) { observers.add(o); }
    public void removeObserver(PedidoObserver o) { observers.remove(o); }

    public void criarPedido(Pedido p) {
        // regras...
        notifyAll(p);
    }

    private void notifyAll(Pedido p) {
        for (PedidoObserver o : observers) o.onPedidoCriado(p);
    }
}
