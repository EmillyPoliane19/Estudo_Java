package diversos.lista2;

import java.util.Scanner;

/** Construir um programa para calcular a o IMC de uma pessoa tendo como entradas a altura e massa levando em consideração o sexo da pessoa. */

public class ExercLista2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        sc.nextLine();

        System.out.println("Qual o seu sexo? (Feminino | Masculino");
        String sexo = sc.nextLine();

        double imc = peso / Math.pow(altura,2);
        if (sexo.equalsIgnoreCase("feminino")) {
            if (imc < 19.1) {
                System.out.println("Abaixo do peso!");
            } else if (imc >= 19.1 && imc < 25.8) {
                System.out.println("No peso normal!");
            } else if (imc >= 25.8 && imc < 27.3) {
                System.out.println("Marginalmente acima do peso");
            } else if (imc >= 27.3 && imc < 32.3) {
                System.out.println("Acima do peso!");
            } else {
                System.out.println("Obeso!");
            }
        } else {
            if (imc < 20.7) {
                System.out.println("Abaixo do peso!");
            } else if (imc >= 20.7 && imc < 26.4) {
                System.out.println("No peso normal!");
            } else if (imc >= 26.4 && imc < 27.8) {
                System.out.println("Marginalmente acima do peso");
            } else if (imc >= 27.8 && imc < 31.1) {
                System.out.println("Acima do peso!");
            } else {
                System.out.println("Obeso!");
            }
        }
        sc.close();
    }
}
