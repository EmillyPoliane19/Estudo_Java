package diversos.lista1;

import java.util.Scanner;

/**Escreva um programa que leia um valor fornecido em uma variável e imprima a tabuada das quatro operações
 (+, -, *, /) para este número como saída.*/

public class ExercLista1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();


        System.out.println("\nADIÇÃO");
        for (int i = 0; i <= 10; i++){
            int soma = numero + i;
            System.out.printf("%d + %d = %d%n",numero,i,soma);
        }

        System.out.println("\nSUBTRAÇÃO");
        for (int i = 0; i <= 10; i++){
            int soma = numero - i;
            System.out.printf("%d - %d = %d%n",numero,i,soma);
        }

        System.out.println("\nMULTIPLICAÇÃO");
        for (int i = 0; i <= 10; i++){
            int soma = numero * i;
            System.out.printf("%d * %d = %d%n",numero,i,soma);
        }

        System.out.println("\nDIVISÃO");
        for (int i = 0; i <= 10; i++){
            if (i != 0){
                int soma = numero / i;
                System.out.printf("%d / %d = %d%n",numero,i,soma);
            }
        }

    }
}
