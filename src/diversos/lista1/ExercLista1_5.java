package diversos.lista1;

import java.util.Scanner;
/**Escreva um programa que leia os valores de a, b e c de uma equação do segundo grau
 no formato ax2 + bx + c = 0, e o programa imprima os valores de x que resolvem a equação.
 Lembre-se que o valor de delta deve ser maior ou igual a 0 para termos raízes reais,
 caso contrário, não há raízes reais que satisfazem a equação.*/

public class ExercLista1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ax2 + bx + c = 0,");

        System.out.println("Digite a letra A:");
        int a = sc.nextInt();

        System.out.println("Digite a letra B:");
        int b = sc.nextInt();

        System.out.println("Digite a letra C:");
        int c = sc.nextInt();

        int delta = (int) (Math.pow(b,2) - 4 * a * c);

        if (delta < 0){
            System.out.println("Não há raízes reais");
        } else {
            int x1 = ( -b + (int)Math.sqrt(delta))/ 2 * a;
            int x2 = ( -b - (int)Math.sqrt(delta))/ 2 * a;
            System.out.printf("X1 = %d %nX2 = %d",x1 ,x2);
        }

    }
}
