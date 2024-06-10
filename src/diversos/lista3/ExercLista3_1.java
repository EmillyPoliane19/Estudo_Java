package diversos.lista3;

import java.util.Scanner;
/**Construa um programa que leia três números
 dados pelo usuário e exiba o maior entre eles.*/

public class ExercLista3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        int numMaior = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();

            if (num > numMaior) {
                numMaior = num;
            }
        }
        System.out.println("O maior número é: " + numMaior);
        sc.close();
    }
}
