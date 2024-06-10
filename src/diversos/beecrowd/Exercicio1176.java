package diversos.beecrowd;

import java.util.Scanner;

public class Exercicio1176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual posição você quer saber?");
        int numero = sc.nextInt();

        long[] fibonacci = new long[numero + 1];

        for (int i = 0; i <= numero; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = i;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        long valorFibonacci = fibonacci[numero];

        System.out.println("Fib(" + numero + ") = " + valorFibonacci);

        sc.close();
    }
}
