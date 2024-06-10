package curso.colecoes;
import java.util.LinkedList;
import java.util.Queue;

public class ConjuntoQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Osvaldo"); // Lançará uma exceção caso a fila esteja cheia.
        fila.offer("Bia"); // Offer retorna falso se a fila esteja cheia.

        //Peek e Element --> obtem o proximo elemento da fila sem remover.
        System.out.println(fila.peek()); // retorna null se a fila estiver vazia.
        System.out.println(fila.element()); // lança uma exceção se a fila eestiver vazia.

        System.out.println(fila.poll()); // retorna null quando a fila ta vazia.


    }
}
