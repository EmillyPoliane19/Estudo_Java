package diversos.lista2;

import java.util.Scanner;
/**Construir um programa para calcular e exibir a média ponderada de 4 números dados pelo usuário,
 cuja ponderação é: 2, 3, 4, 5. */
public class ExercLista2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        final int[] PONDERACAO = {2, 3, 4, 5};

        double notas = 0;
        double somaPonderada = 0;
        double total;
        for (int i = 0; i < PONDERACAO.length; i++) {
            System.out.printf("Digite a %dª nota: ", (i+1));
            notas += sc.nextDouble() * PONDERACAO[i];
            somaPonderada += PONDERACAO[i];
        }

        total = notas/somaPonderada;
        System.out.println("Sua média é: " + total);

        sc.close();
    }
}
