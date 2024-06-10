package diversos.beecrowd;

import java.util.Scanner;

public class Exercicio1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();

        double novoSalario, reajusteSalario, percentual;

        if (salario <= 400.00){
            percentual = 0.15;
        } else if (salario >= 400.01 && salario <= 800.00) {
            percentual = 0.12;
        } else if (salario >= 800.01 && salario <= 1200.00) {
            percentual = 0.10;
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            percentual = 0.07;
        } else {
            percentual = 0.04;
        }

        reajusteSalario = salario * percentual;
        novoSalario = salario + reajusteSalario;

        System.out.printf("Novo salário: %.2f\nReajuste de salário: %.2f\nPercentual de ganho: %.0f%%",
                novoSalario, reajusteSalario, (100 * percentual));

        sc.close();
    }
}
