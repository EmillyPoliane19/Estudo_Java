package src.colecoes;

import java.util.HashSet;

public class HashCode {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();
        usuarios.add(new Usuario("Felipe"));
        usuarios.add(new Usuario("Bruna"));
        usuarios.add(new Usuario("Pedro"));

        System.out.println(usuarios.contains(new Usuario("Bruna")));

    }
}
