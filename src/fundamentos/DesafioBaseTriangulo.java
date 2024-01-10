package fundamentos;

import java.util.Scanner;

public class DesafioBaseTriangulo {
    public static void main(String[] args) {
        //Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
        //Entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a altura do triângulo:");
        double altura = sc.nextDouble();

        System.out.println("Informe a base do triângulo:");
        double base = sc.nextDouble();

        //Processamento

        double area = (base * altura) / 2;

        //Saida
        System.out.printf("A area do triângulo é %.1f", area);
        sc.close();
    }

}
