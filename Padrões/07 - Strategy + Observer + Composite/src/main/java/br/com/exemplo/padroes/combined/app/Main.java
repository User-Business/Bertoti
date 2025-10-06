package br.com.exemplo.padroes.combined.app;

import br.com.exemplo.padroes.combined.composite.*;
import br.com.exemplo.padroes.combined.observer.*;
import br.com.exemplo.padroes.combined.strategy.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.addObserver(new LoggerObserver());
        pedido.addObserver(new AlertaValorObserver(500.0));

        pedido.addComponente(new Item("Mouse", 0.2, 80));
        Pacote combo = new Pacote("Kit Teclado+Headset");
        combo.add(new Item("Teclado", 0.7, 200));
        combo.add(new Item("Headset", 0.4, 250));
        pedido.addComponente(combo);

        pedido.setDistanciaKm(new BigDecimal("18"));
        pedido.setUrgente(true);
        pedido.setFreteStrategy(new SedexFrete());
        pedido.recalcFrete();

        System.out.println("Peso total: " + pedido.getPesoTotal());
        System.out.println("Preço itens: " + pedido.getPrecoTotal());
        System.out.println("Frete (" + new SedexFrete().getNome() + "): " + pedido.getValorFrete());
        System.out.println("Total c/ frete: " + pedido.getTotalComFrete());

        // Troca de estratégia em runtime
        pedido.setFreteStrategy(new PacFrete());
        pedido.recalcFrete();
        System.out.println("Frete (" + new PacFrete().getNome() + "): " + pedido.getValorFrete());
        System.out.println("Total c/ frete: " + pedido.getTotalComFrete());
    }
}
