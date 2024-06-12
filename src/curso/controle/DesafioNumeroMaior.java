package curso.controle;

import java.util.Scanner;

public class DesafioNumeroMaior {
    public static void main(String[] args) {
        /*Crie um programa que recebe 10 valores e ao final imprima o maior número.*/
        Scanner sc = new Scanner(System.in);

        int numeroMaior = 0;
        int numero = 0;

        for (int i = 0;i < 10; i++){
            System.out.printf("Digite o %dº número:%n", (i + 1));
            numero = sc.nextInt();
            if (numero > numeroMaior){
                numeroMaior = numero;
            }
        }
        System.out.println("O maior número é " + numeroMaior);
    }
}
