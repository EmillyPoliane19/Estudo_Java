package src.colecoes;

import java.util.ArrayList;

public class ConjuntoList {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Fernando");
        lista.add(u1);

        lista.add(new Usuario("Clara"));
        lista.add(new Usuario("Pollyclinica"));
        lista.add(new Usuario("Maria luiza"));

        System.out.println(lista.get(3)); //Obtem o elemento através do indice
        System.out.println("Tem esse nome?" + lista.contains(new Usuario("Pote")));
        lista.remove(1);

        for (Usuario u: lista) {
            System.out.println(u);
        }


    }
}
