package diversos.lista2;

import java.util.Scanner;

/** Construir um programa para calcular e exibir a média aritmética de 5 números dados pelo usuário.*/

public class ExercLista2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas notas você quer ?");
        int quantNotas = sc.nextInt();
        double media = 0;

        for (int i = 0; i < quantNotas; i++) {
            System.out.printf("Digite %dª nota: ", i+1);
            media += sc.nextDouble();
        }

        double total = media/quantNotas;
        System.out.printf("Sua média é: %.1f",total);
    }
}
