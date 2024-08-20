package faculdade.estruturadedados;

import faculdade.estruturadedados.exceptions.CollectionsEmptyException;

public class Fila<E> {
    private E[] fila;
    private int tamanho;
    private int inicio;
    private int proximo;

    public Fila() {
        this.fila = (E[]) new Object[2];
        this.tamanho = 0;
        this.inicio = 0;
        this.proximo = 0;
    }

    private void resize(int capacidade) {
        assert capacidade >= tamanho;
        E[] copia = (E[]) new Object[capacidade];

        for (int i = 0; i < tamanho; i++) {
            copia[i] = fila[(inicio + i) % fila.length];
        }
        fila = copia;
        inicio = 0;
        proximo = tamanho;
    }

    public void enqueue(E elemento) {
        if (tamanho == fila.length) resize(2 * fila.length);
        fila[proximo++] = elemento;
        if (proximo == fila.length) proximo = 0;
        tamanho++;
    }

    public E front(){
        if (isEmpty()) throw new CollectionsEmptyException("Fila underflow");
        return fila[inicio];
    }

    public E dequeue() {
        if (isEmpty()) throw new CollectionsEmptyException("Fila underflow");
        E elementoRemovido = fila[inicio];
        fila[inicio] = null;
        tamanho--;
        inicio++;

        if (inicio == fila.length) inicio = 0;
        if (tamanho > 0 && tamanho == fila.length/4) resize(fila.length);
        return elementoRemovido;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }
}
