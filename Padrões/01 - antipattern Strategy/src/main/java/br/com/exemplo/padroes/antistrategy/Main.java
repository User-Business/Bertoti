package br.com.exemplo.padroes.antistrategy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Pedido p = new Pedido(new BigDecimal("5.2"), new BigDecimal("18"), true);
        CalculadoraFrete calc = new CalculadoraFrete();
        System.out.println("SEDEX: " + calc.calcular("SEDEX", p));
        System.out.println("PAC:   " + calc.calcular("PAC", p));
        System.out.println("MOTO:  " + calc.calcular("MOTO", p));
    }
}
