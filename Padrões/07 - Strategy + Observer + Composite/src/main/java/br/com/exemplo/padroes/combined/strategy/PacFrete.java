package br.com.exemplo.padroes.combined.strategy;

import br.com.exemplo.padroes.combined.app.Pedido;
import java.math.BigDecimal;

public class PacFrete implements FreteStrategy {
    @Override public BigDecimal calcular(Pedido p) {
        return new BigDecimal("15.00")
            .add(BigDecimal.valueOf(p.getPesoTotal()).multiply(new BigDecimal("0.90")))
            .add(p.getDistanciaKm().multiply(new BigDecimal("0.25")));
    }
    @Override public String getNome() { return "PAC"; }
}
