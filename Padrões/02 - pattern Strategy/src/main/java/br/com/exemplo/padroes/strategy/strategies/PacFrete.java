package br.com.exemplo.padroes.strategy.strategies;

import br.com.exemplo.padroes.strategy.app.Pedido;
import java.math.BigDecimal;

public class PacFrete implements FreteStrategy {
    @Override
    public BigDecimal calcular(Pedido p) {
        return new BigDecimal("15.00")
            .add(p.getPesoKg().multiply(new BigDecimal("0.90")))
            .add(p.getDistanciaKm().multiply(new BigDecimal("0.25")));
    }
}
