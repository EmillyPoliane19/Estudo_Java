package faculdade.estruturadedados;

import faculdade.estruturadedados.exceptions.CollectionsEmptyException;

public class Lista <E> {
    private No<E> inicio;
    private No<E> ultimo;
    private int tamanho;

    public Lista() {
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void adicionaInicio(E elemento) {
        No<E> antigoInicio = inicio;
        inicio = new No<>();
        inicio.elemento = elemento;
        if (antigoInicio == null) ultimo = inicio;
        else inicio.proximo = antigoInicio;
        tamanho++;
    }

    public void adicionUltimo(E elemento) {
        No<E> antigoUltimo = ultimo;
        ultimo = new No<>();
        ultimo.elemento = elemento;
        if (antigoUltimo == null) inicio = ultimo;
        else antigoUltimo.proximo = ultimo;
        tamanho++;
    }

    public void adicionaQualquerPosicao(int posicao, E elemento) {
        if (posicao < 0 || posicao > tamanho) throw new IllegalArgumentException("Posição inválida");

        if (posicao == 0) adicionaInicio(elemento); //adiciona inicio
        else if (posicao == tamanho) adicionUltimo(elemento); //adiciona final
        else {
            No<E> anterior = buscarNo(posicao - 1);
            No<E> proximo = anterior.proximo;

            No<E> novo = new No<>();
            novo.elemento = elemento;
            novo.proximo = proximo;

            anterior.proximo = novo;
            tamanho++;
        }
    }

    private No<E> buscarNo(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) throw new IllegalArgumentException("Posição não existe");

        No<E> encontrado = inicio;
        for (int i = 0; i < posicao; i++) {
            encontrado = encontrado.proximo;
        }
        return encontrado;

    }

    public int buscar(E elemento) {
        No<E> encontrado = inicio;
        int posicao = 0;
        while (encontrado != null && !encontrado.elemento.equals(elemento)) {
            encontrado = encontrado.proximo;
            posicao++;
        }

        if (encontrado == null) return -1;

        return posicao;
    }

    public E buscar(int posicao) {
        return buscarNo(posicao).elemento;
    }

    public E removerInicio() {
        if (isEmpty()) throw new CollectionsEmptyException("Fila underflow");

        No<E> removido = inicio;
        inicio = inicio.proximo;
        tamanho--;

        if (tamanho == 0) ultimo = null;
        return removido.elemento;
    }

    public E removerFinal() {
        if (isEmpty()) throw new CollectionsEmptyException("Fila underflow");

        if (tamanho == 1) { // Caso em que há apenas um elemento
            No<E> removido = ultimo;
            inicio = ultimo = null;
            tamanho--;
            return removido.elemento;
        }

        No<E> penultimo = buscarNo(tamanho - 2);
        No<E> removido = penultimo.proximo;
        No<E> proximo = removido.proximo;

        penultimo.proximo = proximo;
        removido.proximo = null;
        tamanho--;

        return removido.elemento;
    }

    public E remover(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) throw new IllegalArgumentException("Posição não existe");
        if (posicao == 0) return removerInicio();
        if (posicao ==tamanho-1) return removerFinal();

        No<E> anterior = buscarNo(posicao - 1);
        No<E> removido = anterior.proximo;
        No<E> proximo = removido.proximo;

        anterior.proximo = proximo;
        removido.proximo = null;
        tamanho--;

        if (size() == 0) ultimo = null;

        return removido.elemento;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return inicio == null;
    }
}
