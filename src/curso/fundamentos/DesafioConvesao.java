package curso.fundamentos;

import java.util.Scanner;

public class DesafioConvesao {
    public static void main(String[] args) {
        //entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro salário:");
        String num1 = sc.nextLine().replace(",",".");

        System.out.println("Digite o segundo salário:");
        String num2 = sc.nextLine().replace(",",".");

        System.out.println("Digite o terceiro salário:");
        String num3 = sc.nextLine().replace(",",".");

        //processamento
        double valor1 = Double.parseDouble(num1);
        double valor2 = Double.parseDouble(num2);
        double valor3 = Double.parseDouble(num3);

        double media = (valor1 + valor2 + valor3) / 3;

        //saida
        System.out.printf("A média salarial é %.2f :", media);
        sc.close();
    }
}