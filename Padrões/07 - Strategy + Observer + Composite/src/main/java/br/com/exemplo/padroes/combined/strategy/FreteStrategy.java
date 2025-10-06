package br.com.exemplo.padroes.combined.strategy;

import br.com.exemplo.padroes.combined.app.Pedido;
import java.math.BigDecimal;

public interface FreteStrategy {
    BigDecimal calcular(Pedido p);
    String getNome();
}
