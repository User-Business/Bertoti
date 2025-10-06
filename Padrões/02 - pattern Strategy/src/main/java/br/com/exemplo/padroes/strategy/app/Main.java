package br.com.exemplo.padroes.strategy.app;

import br.com.exemplo.padroes.strategy.strategies.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, FreteStrategy> mapa = new HashMap<>();
        mapa.put("SEDEX", new SedexFrete());
        mapa.put("PAC", new PacFrete());
        mapa.put("MOTO", new MotoboyFrete());
        CalculadoraFrete calc = new CalculadoraFrete(mapa);
        Pedido p = new Pedido(new BigDecimal("5.2"), new BigDecimal("18"), true);
        System.out.println("SEDEX: " + calc.calcular("SEDEX", p));
        System.out.println("PAC:   " + calc.calcular("PAC", p));
        System.out.println("MOTO:  " + calc.calcular("MOTO", p));
    }
}
