package controle;

import java.util.Scanner;

public class DesafioMediaAluno {
    public static void main(String[] args) {
        //Criar um programa que receba duas notas parciais, calcular a média final
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = sc.nextDouble();

        //Processamento e Saída
        double media = (nota1 + nota2)/2;
        if (media >= 7.0){
            System.out.println("Aprovado!");
        } else if (media < 7.0 && media >= 4.0) {
            System.out.println("Em recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
