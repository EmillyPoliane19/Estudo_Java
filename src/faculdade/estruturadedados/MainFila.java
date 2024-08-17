package faculdade.estruturadedados;

public class MainFila {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();
        System.out.println(fila.isEmpty());
        fila.enqueue("Primeiro");
        fila.enqueue("Segundo");
        fila.enqueue("Terceiro");

        fila.dequeue();
        fila.dequeue();
        System.out.println(fila.isEmpty());

        System.out.println(fila.front());
    }
}
