package diversos.beecrowd;

import java.util.Scanner;

public class Exercicio1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        int[] n = new int[10];

        n[0] = num;
        for (int i = 1; i < n.length; i++) {
            n[i] = n[i-1] * 2;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }
    }
}
