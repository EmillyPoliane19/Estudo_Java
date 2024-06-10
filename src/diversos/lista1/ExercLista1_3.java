package diversos.lista1;

import java.util.Scanner;
/**Escreva um programa que leia cinco valores fornecidos em variáveis diferente
 e escreva os valores e seus dobros.*/

public class ExercLista1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int dobroA = a * a;
        System.out.println(a + " dobro --> " + dobroA);

        int dobroB = b * b;
        System.out.println(b + " dobro --> " + dobroB);

        int dobroC = c * c;
        System.out.println(c + " dobro --> " + dobroC);

        int dobroD = d * d;
        System.out.println(d + " dobro --> " + dobroD);

        int dobroE = e * e;
        System.out.println(e + " dobro --> " + dobroE);

        sc.close();
    }
}
