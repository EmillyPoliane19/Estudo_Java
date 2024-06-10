package curso.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMedia {
    public static void main(String[] args) {
        //Criar um programa que receba uma quantidade de notas e calcule a média
        //Usar for para adicionar as notas no array e um foreach para percorrer o array
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas você que calcular?");
        int quantNotas = sc.nextInt();
        double [] notas = new double[quantNotas];

        for (int i = 0; i < notas.length; i++){
            System.out.printf("Digite a %dª nota:", i+1);
            notas[i] = sc.nextDouble();
        }

        double somaMedia = 0;
        for (double nota: notas){
            somaMedia += nota;
        }

        double media = somaMedia/notas.length;
        System.out.printf("Suas notas foram:%n" + Arrays.toString(notas) + "%n");
        System.out.println("A media de notas é " + media);

        sc.close();
    }
}
