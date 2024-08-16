package faculdade.estruturadedados;

import faculdade.estruturadedados.exceptions.StackEmptyException;

import java.util.Iterator;

//Pilhas com vetores
public class Pilha<E> implements Iterable<E> {
    private static final int CAPACITY = 8;
    private E[] pilha;
    private int tamanho;

    public Pilha() {
        this.pilha = (E[]) new Object[CAPACITY];
        this.tamanho = 0;
    }

    public int size() {
        return tamanho;
    }

    public void rezise(int capacity) {
        assert capacity >= tamanho;

        E copy[] = (E[]) new Object[capacity];
        for (int i = 0; i < tamanho; i++) {
            copy[i] = pilha[i];
        }

        this.pilha = copy;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void push(E item) {
        if (tamanho == pilha.length) rezise(2 * pilha.length);
        pilha[tamanho++] = item;
    }

    public E pop() {
        if (tamanho == pilha.length) rezise(2 * pilha.length);
        if (isEmpty()) throw new StackEmptyException("Stack underflow");
        E e = pilha[tamanho - 1];
        pilha[tamanho - 1] = null;
        tamanho--;

        return e;
    }

    public E peek() {
        if (isEmpty()) throw new StackEmptyException("Stack underflow");
        return pilha[tamanho - 1];
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
