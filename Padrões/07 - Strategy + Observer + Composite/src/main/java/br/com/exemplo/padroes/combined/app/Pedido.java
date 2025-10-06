package br.com.exemplo.padroes.combined.app;

import br.com.exemplo.padroes.combined.composite.ComponentePedido;
import br.com.exemplo.padroes.combined.observer.PedidoObserver;
import br.com.exemplo.padroes.combined.strategy.FreteStrategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<ComponentePedido> componentes = new ArrayList<>();
    private final List<PedidoObserver> observers = new ArrayList<>();

    private BigDecimal distanciaKm = BigDecimal.ZERO;
    private boolean urgente = false;

    private FreteStrategy freteStrategy;
    private BigDecimal valorFrete = BigDecimal.ZERO;

    public void addComponente(ComponentePedido c) { componentes.add(c); notifyObservers(); }
    public void addObserver(PedidoObserver o) { observers.add(o); }
    public void removeObserver(PedidoObserver o) { observers.remove(o); }

    public void setDistanciaKm(BigDecimal d) { this.distanciaKm = d; notifyObservers(); }
    public void setUrgente(boolean u) { this.urgente = u; notifyObservers(); }
    public void setFreteStrategy(FreteStrategy s) { this.freteStrategy = s; recalcFrete(); }

    public double getPesoTotal() {
        return componentes.stream().mapToDouble(ComponentePedido::getPesoTotal).sum();
    }
    public double getPrecoTotal() {
        return componentes.stream().mapToDouble(ComponentePedido::getPrecoTotal).sum();
    }

    public void recalcFrete() {
        if (freteStrategy != null) {
            this.valorFrete = freteStrategy.calcular(this);
        } else {
            this.valorFrete = BigDecimal.ZERO;
        }
        notifyObservers();
    }

    public BigDecimal getValorFrete() { return valorFrete; }
    public double getTotalComFrete() { return getPrecoTotal() + valorFrete.doubleValue(); }
    public BigDecimal getDistanciaKm() { return distanciaKm; }
    public boolean isUrgente() { return urgente; }

    private void notifyObservers() {
        for (PedidoObserver o : observers) o.onAtualizado(this);
    }
}
