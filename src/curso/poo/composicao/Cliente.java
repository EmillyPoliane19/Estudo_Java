package curso.poo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Compra> compras = new ArrayList<>();
    private Compra compra;

    public Cliente(String nome) {
        this.nome = nome;
        this.compra = new Compra(this);

    }

    public void fazerCompra(int quantidade, Produto produto) {
        compra.comprar(quantidade, produto);
    }

    public void adcionarCompra(){
        compras.add(compra);
    }

    public double getValorTotal() {
        double valorTotal = 0;

        for (Compra compra : compras) {
            valorTotal += compra.getValorTotal();
        }

        return valorTotal;
    }
}
