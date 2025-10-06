package br.com.exemplo.padroes.strategy.strategies;

import br.com.exemplo.padroes.strategy.app.Pedido;
import java.math.BigDecimal;

public class MotoboyFrete implements FreteStrategy {
    @Override
    public BigDecimal calcular(Pedido p) {
        return new BigDecimal("12.00")
            .add(p.getPesoKg().multiply(new BigDecimal("1.20")))
            .add(p.getDistanciaKm().multiply(new BigDecimal("0.80")));
    }
}
