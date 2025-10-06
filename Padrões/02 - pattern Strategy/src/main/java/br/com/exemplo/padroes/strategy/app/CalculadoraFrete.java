package br.com.exemplo.padroes.strategy.app;

import br.com.exemplo.padroes.strategy.strategies.FreteStrategy;
import java.math.BigDecimal;
import java.util.Map;

public class CalculadoraFrete {
    private final Map<String, FreteStrategy> estrategias;
    public CalculadoraFrete(Map<String, FreteStrategy> estrategias) {
        this.estrategias = Map.copyOf(estrategias);
    }
    public BigDecimal calcular(String modo, Pedido p) {
        FreteStrategy s = estrategias.get(modo.toUpperCase());
        if (s == null) throw new IllegalArgumentException("Modo não suportado: " + modo);
        return s.calcular(p);
    }
}
