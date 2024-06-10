package curso.fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //Entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("Qual operação você deseja fazer? |+ - * / |");
        String operador = sc.next();

        //Processamento

        double operacao = "+".equals(operador) ? num1 + num2 : 0;
        operacao = "-".equals(operador) ? num1 - num2 : operacao;
        operacao = "*".equals(operador) ? num1 * num2 : operacao;
        operacao = "/".equals(operador) ? num1 / num2 : operacao;

        //Saida
        System.out.printf("%.2f %s %.2f = %.2f", num1,operador,num2, operacao);
        sc.close();
    }
}
