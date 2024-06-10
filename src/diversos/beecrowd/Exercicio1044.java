package diversos.beecrowd;

import java.util.Scanner;

public class Exercicio1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numeroA = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int numeroB = sc.nextInt();

        if (numeroA % numeroB == 0 || numeroB % numeroA == 0){
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
    }
}
