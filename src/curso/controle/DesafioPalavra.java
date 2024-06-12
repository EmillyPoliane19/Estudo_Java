package curso.controle;

import java.util.Scanner;

public class DesafioPalavra {
    public static void main(String[] args) {
        /*Criar um programa que receba uma palavra e imprime no console letra por letra.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma palavra:");
        String palavra = sc.nextLine();

        char letras[] = palavra.toCharArray();

        for (char i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        sc.close();
    }
}
