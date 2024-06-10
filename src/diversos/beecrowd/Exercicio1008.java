package diversos.beecrowd;

import java.util.Scanner;

public class Exercicio1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número:");
        int num = sc.nextInt();

        System.out.println("Quantas horas trabalhadas?");
        int horasTraba = sc.nextInt();

        System.out.println("Qual o valor que recebe por hora?");
        double valorPorHora = sc.nextDouble();

        double totalReceber = horasTraba * valorPorHora;

        System.out.printf("Olá número %d! Seu salário é %.2f.",num,totalReceber);
    }
}
