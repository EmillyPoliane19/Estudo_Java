package src.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class ConjuntoStack {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();
        livros.add("Extraordinário");
        livros.push("Cidade dos Etereos");
        livros.push("Arroz");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.pop()); //Pop remove
        System.out.println(livros.pop());
    }
}
