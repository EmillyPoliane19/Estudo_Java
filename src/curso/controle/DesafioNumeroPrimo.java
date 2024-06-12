package curso.controle;

import java.util.Scanner;

public class DesafioNumeroPrimo {
    public static void main(String[] args) {
        //Criar um programa que receba um número e diga se ele é um número primo
        //Entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        //Processamento
        int quantDivisores = 0;
        for (int i = 2; i < numero;i++){
            if (numero % i == 0){
                quantDivisores ++;
            }
        }

        if (quantDivisores != 0){
            System.out.println("O número " + numero + " não é primo");

        } else {
            System.out.printf("O número " + numero + " é primo!");
        }
        sc.close();
    }
}
