package controle;

import java.util.Scanner;

public class DesafioAnoBissexto {
    public static void main(String[] args) {
        //Criar um programa informa se o ano atual é um ano bissexto
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um ano:");
        int ano = sc.nextInt();

        //Processamento e Saida
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
                System.out.println("O ano é bissexto!");
        } else {
            System.out.println("O ano não é bissexto!");
        }
    }
}
