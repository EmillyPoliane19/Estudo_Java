package curso.controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        //criar um programa que diga o numero referente ao dia da
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um dia da semana:");
        String diaSemana = sc.next();

        //Processamento e Saida
        if (diaSemana.equalsIgnoreCase("domingo")){
            System.out.println("Dia 1 da semana");
        } else if (diaSemana.equalsIgnoreCase("segunda")) {
            System.out.println("Dia 3 da semana");
        } else if (diaSemana.equalsIgnoreCase("terça")) {
            System.out.println("Dia 3 da semana");
        } else if (diaSemana.equalsIgnoreCase("quarta")) {
            System.out.println("Dia 4 da semana");
        } else if (diaSemana.equalsIgnoreCase("quinta")) {
            System.out.println("Dia 5 da semana");
        } else if (diaSemana.equalsIgnoreCase("sexta")) {
            System.out.println("Dia 6 da semana");
        } else if (diaSemana.equalsIgnoreCase("sábado")) {
            System.out.println("Dia 7 da semana");
        } else {
            System.out.println("Dia inválido");
        }

        sc.close();
    }
}
