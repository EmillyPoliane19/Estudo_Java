package curso.controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        //Criar um program  ue receba notas e calcule a média dessas notas
        //Utilizar -1 para o programa finalizar

        //Entrada e Processamento
        Scanner sc = new Scanner(System.in);
        double total = 0 , notas = 0, somaMedia = 0;
        while (notas != -1) {
            System.out.println("Digite uma nota ou -1 para sair:");
            notas = sc.nextDouble();
            if (notas >= 0 && notas <= 10){
                total += notas;
                somaMedia ++;
            } else if (notas != -1) {
                System.out.println("Digite uma nota valida");
            }
        }
        //Saida
        double media = total/somaMedia;
        System.out.printf("A soma das notas é: %.2f e a média da turma é: %.2f",total,media);
        sc.close();
    }
}
