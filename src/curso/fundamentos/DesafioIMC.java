package curso.fundamentos;

import java.util.Scanner;

public class DesafioIMC {
    public static void main(String[] args) {
        //Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
        //entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Digite seua altura:");
        double altura = sc.nextDouble();

        //processamento
        double imc = peso / Math.pow(altura,2);

        //saida
        System.out.printf("Seu Imc é %.2f", imc);
        sc.close();
    }
}
