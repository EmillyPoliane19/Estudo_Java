package curso.controle;

import java.util.Scanner;

public class DesafioNumeroPar {
    public static void main(String[] args) {
        //Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 0 e 10:");
        int num = sc.nextInt();

        //Processamento e Saida
        if (num >= 0 && num <= 10){
            if (num % 2 == 0){
                System.out.print("Esse número é par!");
            } else {
                System.out.print("Esse número é impar!");
            }
        } else {
            System.out.print("Esse número não está entre 0 e 10 :(");
        }
        sc.close();
    }
}
