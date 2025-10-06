package br.com.exemplo.padroes.strategy.strategies;

import br.com.exemplo.padroes.strategy.app.Pedido;
import java.math.BigDecimal;

public class SedexFrete implements FreteStrategy {
    @Override
    public BigDecimal calcular(Pedido p) {
        BigDecimal base = new BigDecimal("22.00");
        BigDecimal valor = base
            .add(p.getPesoKg().multiply(new BigDecimal("1.50")))
            .add(p.getDistanciaKm().multiply(new BigDecimal("0.40")));
        if (p.isUrgente()) valor = valor.add(new BigDecimal("10.00"));
        return valor;
    }
}
