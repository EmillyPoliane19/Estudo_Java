package diversos.aleatorios;

import java.util.Scanner;

public class ExercicioTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");

        String a = sc.nextLine();
        String b = " fuv,whixya.rstjkg)mnopqlbcdez:";
        StringBuilder v = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char charA = a.charAt(i);

            for (int j = 0; j < b.length(); j++) {
                char charB = b.charAt(j);
                System.out.print(v.toString());
                System.out.println(charB);
                try {
                    // Adiciona um atraso de 500 milissegundos (0.5 segundos) entre cada adição de letra
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (charA == charB) {
                    v.append(charB);
                    break;
                }
            }
        }

    }
}
