package fundamentos;

import java.util.Scanner;


public class DesafioEquacao2Grau {
    public static void main(String[] args) {
        //Calcular equações do segundo grau
        //Entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do A:");
        int letraA = sc.nextInt();

        System.out.println("Informe o valor do B");
        int letraB = sc.nextInt();

        System.out.println("Informe o valor do C");
        int letraC = sc.nextInt();

        //Processamento

        int delta = (letraB * letraB) - (4 * letraA * letraC);
        double equacao1 = (- letraB + Math.sqrt(delta)) / 2 * letraA; // X'
        double equacao2 = (- letraB - (float) Math.sqrt(delta)) / 2 * letraA; // X"

        //Saida
        System.out.printf("A equação tem o X'= %.2f e o X\"= %.2f", equacao1,equacao2);
        sc.close();
    }
}
