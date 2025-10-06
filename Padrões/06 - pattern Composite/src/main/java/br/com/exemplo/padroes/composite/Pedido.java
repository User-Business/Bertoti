package br.com.exemplo.padroes.composite;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<ComponentePedido> componentes = new ArrayList<>();
    public void add(ComponentePedido c) { componentes.add(c); }
    public double getPesoTotal() {
        return componentes.stream().mapToDouble(ComponentePedido::getPesoTotal).sum();
    }
    public double getPrecoTotal() {
        return componentes.stream().mapToDouble(ComponentePedido::getPrecoTotal).sum();
    }
}
