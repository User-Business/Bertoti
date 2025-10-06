package br.com.exemplo.padroes.antistrategy;

import java.math.BigDecimal;

public class CalculadoraFrete {
    public BigDecimal calcular(String modo, Pedido p) {
        if ("SEDEX".equalsIgnoreCase(modo)) {
            BigDecimal base = new BigDecimal("22.00");
            BigDecimal valor = base
                .add(p.getPesoKg().multiply(new BigDecimal("1.50")))
                .add(p.getDistanciaKm().multiply(new BigDecimal("0.40")));
            if (p.isUrgente()) valor = valor.add(new BigDecimal("10.00"));
            return valor;
        } else if ("PAC".equalsIgnoreCase(modo)) {
            return new BigDecimal("15.00")
                .add(p.getPesoKg().multiply(new BigDecimal("0.90")))
                .add(p.getDistanciaKm().multiply(new BigDecimal("0.25")));
        } else if ("MOTO".equalsIgnoreCase(modo)) {
            return new BigDecimal("12.00")
                .add(p.getPesoKg().multiply(new BigDecimal("1.20")))
                .add(p.getDistanciaKm().multiply(new BigDecimal("0.80")));
        } else {
            throw new IllegalArgumentException("Modo desconhecido: " + modo);
        }
    }
}
