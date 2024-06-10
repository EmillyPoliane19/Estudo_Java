package curso.fundamentos;

import java.util.Scanner;

public class DesafioTemperatura {
    public static void main(String[] args) {
        //*Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius
        // E Celsius para Fahrenheit*/

        //Entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura:");
        double temperatura = sc.nextDouble();

        System.out.println("Você que converter para Celsius ou Fahrenheit? (C | F)");
        String escalaTermo = sc.next();

        //Processamento

        double equacao = "C".equals(escalaTermo) ? (temperatura - 32)/1.8 : 0;
        equacao = "F".equals(escalaTermo) ? temperatura * 1.8 + 32 : equacao;

        //Saida
        System.out.printf("A temperatura %f convertida para %s é igual a %f%s", temperatura,escalaTermo,equacao,escalaTermo);
        sc.close();
    }
}
