package diversos.lista3;

import java.util.Scanner;
/**Escreva um programa que leia o código do item pedido, a quantidade e
 calcule o valor a ser pago por aquele lanche. Considere que a cada execução
 somente será calculado um item.*/

public class ExercLista3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.print("____________Cardápio___________\n");
        System.out.print("|Cachorro Quente | 100 | 1,20 |\n");
        System.out.print("|Bauru Simples   | 101 | 1,30 |\n");
        System.out.print("|Bauru Com Ovo   | 102 | 1,50 |\n");
        System.out.print("|Hambúrger       | 103 | 1,20 |\n");
        System.out.print("|Cheeseburguer   | 104 | 1,30 |\n");
        System.out.print("|Refrigerante    | 105 | 1,00 |\n");

        System.out.println("\nDigite o código do produto:");
        int escolha = sc.nextInt();

        System.out.println("Quantidade:");
        int quantidade = sc.nextInt();
        double valor;

        switch (escolha) {
            case 100:
                valor = 1.20 * quantidade;
                System.out.printf("Você comprou %d Cachorros Quentes %nValor total: R$%.2f",quantidade, valor);
                break;
            case 101:
                valor = 1.30 * quantidade;
                System.out.printf("Você comprou %d Bauru Simples%nValor total: R$%.2f",quantidade, valor);
                break;
            case 102:
                valor = 1.50 * quantidade;
                System.out.printf("Você comprou %d Bauru Com Ovo%nValor total: R$%.2f",quantidade, valor);
                break;
            case 103:
                valor = 1.20 * quantidade;
                System.out.printf("Você comprou %d hamburgues%nValor total: R$%.2f",quantidade, valor);
                break;
            case 104:
                valor = 1.30 * quantidade;
                System.out.printf("Você comprou %d Cheeseburguers%nValor total: R$%.2f",quantidade, valor);
                break;
            case 105:
                valor = 1.00 * quantidade;
                System.out.printf("Você comprou %d Refrigerantes%nValor total: R$%.2f",quantidade, valor);
                break;
            default:
                System.out.println("Código de item inválido. Por favor, escolha um item válido do cardápio.");
        }
        sc.close();
    }
}
