package diversos.lista2;

import java.util.Scanner;
/** Construir um programa para calcular a o IMC de uma pessoa tendo como entradas a altura e massa de uma pessoa.
 Imprima o resultado e informe se o valor está acima do peso, se está obeso ou
 abaixo do peso ideal considerado saudável.*/

public class ExercLista2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        double imc = peso / Math.pow(altura,2);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso!");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("No peso normal!");
        }else if (imc >= 25.0 && imc < 30) {
            System.out.println("Acima do peso!");
        }else {
            System.out.println("Obeso!");
        }

        sc.close();
    }
}
