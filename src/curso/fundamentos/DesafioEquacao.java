package curso.fundamentos;

import java.util.Scanner;

public class DesafioEquacao {
    public static void main(String[] args) {
        //Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        double num = sc.nextDouble();

        //Processamento
        Double equacaoQuadrado = Math.pow(num,2);
        Double equacaoCubo = Math.pow(num, 3);

        //Saida
        System.out.printf("O numero %.2f ao quadrado é: %.2f\ne ao cubo é: %.2f",
                num, equacaoQuadrado, equacaoCubo);

        sc.close();
    }
}
