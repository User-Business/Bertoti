package br.com.exemplo.padroes.anticomposite;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<Item> itens = new ArrayList<>();
    private final List<Pacote> pacotes = new ArrayList<>();

    public void addItem(Item i) { itens.add(i); }
    public void addPacote(Pacote p) { pacotes.add(p); }

    public double getPesoTotal() {
        double total = 0;
        for (Item i : itens) total += i.getPeso();
        for (Pacote p : pacotes)
            for (Item i : p.getItens()) total += i.getPeso();
        return total;
    }

    public double getPrecoTotal() {
        double total = 0;
        for (Item i : itens) total += i.getPreco();
        for (Pacote p : pacotes)
            for (Item i : p.getItens()) total += i.getPreco();
        return total;
    }
}
