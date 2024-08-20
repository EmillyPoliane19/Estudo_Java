package faculdade.estruturadedados;

import faculdade.estruturadedados.exceptions.CollectionsEmptyException;

public class ListaDuplamenteEncadeada<E> {
    Node<E> inicio;
    Node<E> fim;
    int tamanho;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void adicionaInicio(E elemento) {
        Node<E> antigoInicio = inicio;
        inicio = new Node<>();
        inicio.elemento = elemento;
        inicio.proximo = antigoInicio;
        if (antigoInicio == null) {
            fim = inicio;
        } else {
            antigoInicio.anterior = inicio;
        }
        tamanho++;
    }

    public void adicionaFinal(E elemento) {
        Node<E> antigoFinal = fim;
        fim = new Node<>();
        fim.elemento = elemento;
        fim.anterior = antigoFinal;

        if (antigoFinal == null) {
            inicio = fim;
        } else {
            antigoFinal.proximo = fim;
        }
        tamanho++;
    }

    public void adicionaQualquerPosicao(int posicao, E elemento) {
        if (posicao < 0 || posicao > tamanho) throw new IllegalArgumentException("Posição inválida");
        if (posicao == 0) adicionaInicio(elemento);
        else if (posicao == tamanho) adicionaFinal(elemento);
        else {
            Node<E> anterior = buscarNo(posicao - 1);
            Node<E> proximo = anterior.proximo;
            Node<E> novo = new Node<>();

            novo.elemento = elemento;
            novo.anterior = anterior;
            novo.proximo = proximo;
            anterior.proximo = novo;
            proximo.anterior = novo;

            tamanho++;
        }
    }

    private Node<E> buscarNo(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) throw new IllegalArgumentException("Posição não existe");

        Node<E> encontrado = inicio;
        for (int i = 0; i < posicao; i++) {
            encontrado = encontrado.proximo;
        }
        return encontrado;
    }

    public E buscar(int posicao) {
        return buscarNo(posicao).elemento;
    }

    public int buscar(E elemento) {
        Node<E> encontrado = inicio;
        int posicao = 0;
        while (encontrado != null && !encontrado.elemento.equals(elemento)) {
            encontrado = encontrado.proximo;
            posicao++;
        }
        if (encontrado == null) return -1;
        return posicao;
    }

    public E removerInicio() {
        if (isEmpty()) throw new CollectionsEmptyException("Fila underflow");
        Node<E> removido = inicio;
        inicio = inicio.proximo;

        if (inicio == null) { // Se a lista ficou vazia
            fim = inicio;
        } else {
            inicio.anterior = null;
        }
        tamanho--;
        return removido.elemento;
    }

    public E removerFinal() {
        if (isEmpty()) throw new CollectionsEmptyException("Lista vazia");

        Node<E> removido = fim;

        if (tamanho == 1) { // Caso em que há apenas um elemento
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }

        tamanho--;
        return removido.elemento;
    }


    public E remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) throw new IllegalArgumentException("Posição inválida");
        if (posicao == 0) return removerInicio();
        if (posicao == tamanho - 1) return removerFinal();

        Node<E> anterior = buscarNo(posicao - 1);
        Node<E> removido = anterior.proximo;
        Node<E> proximo = removido.proximo;

        anterior.proximo = proximo;
        if (proximo != null) {
            proximo.anterior = anterior;
        }
        removido.proximo = null;
        removido.anterior = null;
        tamanho--;
        return removido.elemento;
    }


    public boolean isEmpty() {
        return inicio == null;
    }

    public int size() {
        return tamanho;
    }
}
