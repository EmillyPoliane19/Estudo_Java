package src.classes.DesafioComida;

import java.util.Scanner;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("João",99.8);
        Comida c1 = new Comida("Macarronada",0.180);
        Comida c2 = new Comida("Lasanha",0.300);

        System.out.println(p.status());
        p.comer(c1);

        System.out.printf("Depois de comer %s ", c1.nome + " " + p.status());
        p.comer(c2);

        System.out.printf("\nDepois de comer %s ", c2. nome + " " + p.status());


    }
}
