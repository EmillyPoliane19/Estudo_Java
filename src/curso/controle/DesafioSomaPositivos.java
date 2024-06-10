package src.controle;

import java.util.Scanner;

public class DesafioSomaPositivos {
    public static void main(String[] args) {
        /**
         * Criar um programa que enquanto estiver recebendo números positivos,
         * imprime no console a soma dos números inseridos,
         * Caso receba um número negativo,encerre o programa.*/

        Scanner sc = new Scanner(System.in);

        int somaNumeros = 0;
        int numeros = 0;

        while (numeros >= 0){
            System.out.println("Digite um número positivo ou um negativo para sair:");
            numeros = sc.nextInt();

            if (numeros > -1) {
                somaNumeros += numeros;
                System.out.printf("O total até agora é:%d\n",somaNumeros);
            }
        }
        sc.close();
    }
}
