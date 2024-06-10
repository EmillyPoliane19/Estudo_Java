package diversos.lista1;

import java.util.Scanner;

/**Escreva um programa que leia três valores em variáveis distintas e armazene a soma
 em uma outra variável e escreva o valor obtido.*/

public class ExercLista1_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System .in);
        System.out.println("Digite o 1º número :");
        int a = sc.nextInt();

        System.out.println("Digite o 2º número :");
        int b = sc.nextInt();

        System.out.println("Digite o 3º número :");
        int c = sc.nextInt();

        int soma = a + b + c;
        System.out.println(soma);

        sc.close();
    }
}
