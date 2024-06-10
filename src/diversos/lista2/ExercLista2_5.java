package diversos.lista2;

import java.util.Scanner;

/**Construir um programa para dado três valores, informar ao usuário se eles podem ser os lados de um triângulo.*/

public class ExercLista2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        boolean isTrue = false;
        double lado1, lado2, lado3;

        while (!isTrue) {
            System.out.println("Digite o 1º numero");
            lado1 = sc.nextDouble();

            System.out.println("Digite o 2º numero");
            lado2 = sc.nextDouble();

            System.out.println("Digite o 3º numero");
            lado3 = sc.nextDouble();

            if (isTriangulo(lado1,lado2,lado3)) {
                System.out.println("É um triângulo!");
                isTrue = true;
            }else {
                System.out.println("Não é um triângulo! Tente De novo!");
                isTrue = false;
            }
        }
        sc.close();
    }

    private static boolean isTriangulo(double a,double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}

