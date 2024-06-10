package diversos.lista3;

import java.util.Scanner;

/**Construa um programa onde o usuario possa escolher que tipo de média
 deseja calcular a partir de 3 notas. Faça um programa que leia as notas,
 a opção escolhida pelo usuário e calcule a média.*/

public class ExercLista3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        double [] notas = new double[3];
        double [] ponderacao = {3,3,4};

        double media = 0;
        double soma = 0;
        double somaInversos = 0;

        System.out.println("Qual tipo de média você deseja calcular?");
        String tipoMedia = sc.next();

        for (int i=0; i < 3; i++) {
            System.out.printf("Digite a %dª nota:",(i+1));
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        if (tipoMedia.equalsIgnoreCase("Aritmetica")) {
            media = soma/3;
            System.out.printf("A média aritmética é %.2f ", media);

        } else if (tipoMedia.equalsIgnoreCase("ponderada")) {
            int somaPonderacao = 0;
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i] * ponderacao[i];
                somaPonderacao += ponderacao[i];
            }
            media = soma / somaPonderacao;
            System.out.printf("A média ponderada é %.2f ", media);

        } else if (tipoMedia.equalsIgnoreCase("harmonica")){
            for (double nota : notas) {
                somaInversos += 1.0 / nota;
            }
            media = notas.length/ somaInversos;
            System.out.printf("A média harmônica é %.2f ", media);

        } else {
            System.out.println("Tipo de média inválido. Escolha entre Aritmetica, Ponderada ou Harmonica.");
        }

        sc.close();
    }
}
