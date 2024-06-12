package curso.poo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private Cliente cliente;
    private List<Item> itens = new ArrayList<>();
    private Item item;

    public Compra(Cliente cliente) {
        this.cliente = cliente;
    }

    public void comprar(int quantidade, Produto produto) {
        this.item = new Item(quantidade, produto);
        itens.add(item);
    }

    public double getValorTotal() {
        double valorTotal = 0;

        for (Item i : itens) {
            valorTotal += i.getProduto().getPreco() * i.getQuatidade();
        }
        return valorTotal;
    }
}
