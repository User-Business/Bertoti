package br.com.exemplo.padroes.strategy.app;

import java.math.BigDecimal;

public class Pedido {
    private final BigDecimal pesoKg;
    private final BigDecimal distanciaKm;
    private final boolean urgente;

    public Pedido(BigDecimal pesoKg, BigDecimal distanciaKm, boolean urgente) {
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
        this.urgente = urgente;
    }
    public BigDecimal getPesoKg() { return pesoKg; }
    public BigDecimal getDistanciaKm() { return distanciaKm; }
    public boolean isUrgente() { return urgente; }
}
