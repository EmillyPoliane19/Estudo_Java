package diversos.beecrowd;

public class Exercicio1059 {
    public static void main(String[] args) {
        //Faça um programa que mostre os números pares entre 1 e 100, inclusive
        //Com While
        int numero = 0;
        while (numero <100) {
            numero += 2;
            System.out.println(numero);
        }

        //Com For
        for (int i = 0; i <= 100; i += 2){
            System.out.println(i);
        }
    }
}
