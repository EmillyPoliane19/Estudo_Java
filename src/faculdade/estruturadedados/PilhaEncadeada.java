package faculdade.estruturadedados;

import faculdade.estruturadedados.exceptions.CollectionsEmptyException;

import java.util.Iterator;

public class PilhaEncadeada<E> implements Iterable<E> {
    private No<E> topo;
    private int tamanho;

    public PilhaEncadeada() {
        this.topo = null;
        this.tamanho = 0;
    }

    public void push(E elemento) {
        No<E> antigoTopo = topo;
        topo = new No<>();
        topo.elemento = elemento;
        topo.proximo = antigoTopo;
        tamanho ++;
    }

    public E pop() {
        if (isEmpty()) throw new CollectionsEmptyException("Stack underflow");
        E elementoExcluido = topo.elemento;
        topo = topo.proximo;
        tamanho--;
        return elementoExcluido;
    }

    public E peek() {
        if (isEmpty()) throw new CollectionsEmptyException("Stack underflow");
        return topo.elemento;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int size() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (E elemento : this) {
            s.append(elemento);
            s.append("  ");
        }

        return s.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
