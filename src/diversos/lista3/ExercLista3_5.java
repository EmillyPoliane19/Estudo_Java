package diversos.lista3;

import java.util.Scanner;

/**Escrever um programa que lê um valor em reais e calcula qual o menor número possível de notas
 de 100, 50, 20, 10, 5 e 1 em que o valor lido pode ser decomposto. Escrever o valor lido e
 a relação de notas necessárias.*/

public class ExercLista3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Digite um valor:");
        int valor = sc.nextInt();
        int valorInicial = valor;

        int notas100 = 0;
        int notas50 = 0;
        int notas20 = 0;
        int notas10 = 0;
        int notas1 = 0;

        for (int i = valor; i >= 0; i--) {
            if (valor >= 100) {
                valor -= 100;
                notas100 ++;
            } else if (valor >= 50) {
                valor -= 50;
                notas50 ++;
            } else if (valor >= 20) {
                valor -= 20;
                notas20 ++;
            } else if (valor >= 10) {
                valor -= 10;
                notas10 ++;
            } else if (valor >= 1) {
                valor -= 1;
                notas1 ++;
            }
        }
        System.out.printf("O valor %d pode ser decomposto em:%n",valorInicial);
        if (notas100 > 0) {
            System.out.printf("%d notas de 100%n",notas100);
        }
        if (notas50 > 0) {
            System.out.printf("%d notas de 50%n",notas50);
        }
        if (notas20 > 0) {
            System.out.printf("%d notas de 20%n",notas20);
        }
        if (notas10 > 0) {
            System.out.printf("%d notas de 10%n",notas10);
        }
        if (notas1 > 0) {
            System.out.printf("%d moedas de 1%n",notas1);
        }
        sc.close();
    }
}
