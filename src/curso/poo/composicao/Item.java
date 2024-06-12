package curso.poo.composicao;

public class Item {
    private int quatidade;
    private Produto produto;

    public Item(int quatidade, Produto produto) {
        this.quatidade = quatidade;
        this.produto = produto;
    }

    public int getQuatidade() {
        return quatidade;
    }

    public Produto getProduto() {
        return produto;
    }
}
