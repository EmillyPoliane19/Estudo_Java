package diversos.beecrowd;

import java.util.Scanner;

public class Execicio1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double[] PESOS = {2,3,5};

        double[] notas = new double[3];
        double somaMedia = 0;
        double somaPesos = 0;
        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + (i+1) + "ª nota :");
            notas[i] = sc.nextDouble();

            somaMedia += notas[i] * PESOS[i];
            somaPesos += PESOS[i];
        }

        total = somaMedia/somaPesos;
        System.out.println("A média final é: " + total);
    }
}
