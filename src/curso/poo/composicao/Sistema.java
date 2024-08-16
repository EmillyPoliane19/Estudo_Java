package curso.poo.composicao;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");
        Compra compra1 = new Compra(cliente);

        Produto produto1 = new Produto(5.00, "Nutella");
        Produto produto2 = new Produto(10.00, "Barra de Chocolate");

        cliente.fazerCompra(2, produto1);
        cliente.fazerCompra(2, produto2);

        cliente.adcionarCompra();

        double valor = cliente.getValorTotal();
        System.out.println(valor);
    }
}
