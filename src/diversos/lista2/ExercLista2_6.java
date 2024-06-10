package diversos.lista2;

import java.util.Scanner;

/**Uma empresa paga 5% de comissão ao funcionário que vender até R$ 2.000,00 em mercadorias mensalmente,
 6% de comissão ao funcionário que vender acima de R$ 2.000,00 e abaixo de R$ 8.000,00 em mercadorias mensalmente
 e 8% de comissão ao funcionário que vender acima de R$ 8.000,00 em mercadorias mensalmente.
 Dado o valor em mercadorias vendidas por um funcionário, exiba o valor de sua comissão.*/

public class ExercLista2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a qauntidade vendida:");
        double quantMercadorias = sc.nextDouble();

        double valorComissao = cacularComicao(quantMercadorias);
        System.out.println("Comissão: " + valorComissao);
    }

    private static double cacularComicao(double valorVendas) {
        if (valorVendas <= 2.000) {
            return valorVendas * 0.05;
        } else if (valorVendas > 2.000 && valorVendas < 8.000) {
            return valorVendas * 0.06;
        } else{
            return valorVendas * 0.08;
        }
    }
}
