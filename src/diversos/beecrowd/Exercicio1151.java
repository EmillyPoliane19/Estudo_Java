package diversos.beecrowd;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros você quer? (Lembre-se menor que 46!)");
        int num = sc.nextInt();

        int[] fibonacci = new int[num+1];

        for (int i = 0; i <= num ; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = i;
            }
            else {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }
        System.out.println(Arrays.toString(fibonacci));
        sc.close();
    }
}
