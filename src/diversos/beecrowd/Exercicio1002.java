package diversos.beecrowd;

import java.util.Scanner;

public class Exercicio1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double n = 3.14159;

        System.out.println("Digite o raio:");
        double raio = sc.nextDouble();

        double area = n * Math.pow(raio,2);

        System.out.printf("A area da circunferência é %.4f:", area);
    }
}
