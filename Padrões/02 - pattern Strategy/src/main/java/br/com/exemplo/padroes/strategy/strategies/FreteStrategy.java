package br.com.exemplo.padroes.strategy.strategies;

import br.com.exemplo.padroes.strategy.app.Pedido;
import java.math.BigDecimal;

public interface FreteStrategy {
    BigDecimal calcular(Pedido pedido);
}
