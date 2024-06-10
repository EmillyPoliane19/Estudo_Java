package diversos.lista1;

import java.util.Scanner;

/**Escreva um programa que leia três valores em variáveis diferentes, a soma das duas primeiras
 em uma nova variável e o produto das duas últimas em uma outra variável e mostre o produto das duas novas variáveis
 em uma terceira variável.*/

public class ExercLista1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Digite o 1º número :");
        int a = sc.nextInt();

        System.out.println("Digite o 2º número :");
        int b = sc.nextInt();

        System.out.println("Digite o 3º número :");
        int c = sc.nextInt();

        int somaPrimeiras = a + b;
        int produtoSegundas = b * c;

        int produto = somaPrimeiras * produtoSegundas;

        System.out.println(produto);

        sc.close();


    }
}
