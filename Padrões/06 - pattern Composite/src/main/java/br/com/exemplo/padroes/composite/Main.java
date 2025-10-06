package br.com.exemplo.padroes.composite;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.add(new Item("Mouse", 0.2, 80));
        Pacote combo = new Pacote("Kit Teclado+Headset");
        combo.add(new Item("Teclado", 0.7, 200));
        combo.add(new Item("Headset", 0.4, 250));
        pedido.add(combo);

        System.out.println("Peso total: " + pedido.getPesoTotal());
        System.out.println("Preço total: " + pedido.getPrecoTotal());
    }
}
