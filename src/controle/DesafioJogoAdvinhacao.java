package src.controle;

import java.util.Random;
import java.util.Scanner;

public class DesafioJogoAdvinhacao {
    public static void main(String[] args) {
        //Criar um jogo da advinhação com 10 tentativas
        //Entrada e processamento
        Scanner sc = new Scanner(System.in);

        Random numeroAleatorio = new Random();
        int numeroMisterioso = numeroAleatorio.nextInt(101);

        boolean acertou = false;

        for (int i = 1; i < 11; i++) {

            System.out.println("Qual é o número?");
            int numero = sc.nextInt();

            if (numero > numeroMisterioso) {
                System.out.print("O número é menor que " + numero);

            } else if (numero < numeroMisterioso) {
                System.out.print("O número é maior que " + numero);

            } else if (numeroMisterioso == numero) {
                System.out.printf("Parabêns! Você acertou em %d tentativas",i);
                acertou = true;
                break;
            }
            System.out.println(" você tem " + (10-i) + " tentativas");
        }
        if (!acertou){
            System.out.printf("\nO número sorteado era %d\nQue pena! Você não conseguiu acertar :(", numeroMisterioso);
        }
        sc.close();
    }
}
