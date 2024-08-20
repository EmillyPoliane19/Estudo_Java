package faculdade.estruturadedados;

import faculdade.estruturadedados.exceptions.CollectionsEmptyException;

public class LisdaDuplamenteEncadeadaSentinelas <E>{
    private Node<E> inicio;
    private Node<E> fim;
    private int tamanho;

    public LisdaDuplamenteEncadeadaSentinelas() {
        this.inicio = new Node<>();
        this.fim = new Node<>();
        inicio.proximo = fim;
        fim.anterior = inicio;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }

    public void addFinal(E elemento0) {
        Node<E> anterior = fim.anterior;
        Node<E> novo = new Node<>();
        novo.elemento = elemento0;
        novo.proximo = fim;
        novo.anterior = anterior;
        fim.anterior = novo;
        anterior.proximo = novo;
        tamanho++;
    }

    public void addInicio(E elemento) {
        Node<E> primeiro = inicio.proximo;
        Node<E> novo = new Node<>();
        novo.elemento = elemento;
        novo.anterior = inicio;
        novo.proximo = primeiro;
        inicio.proximo = novo;
        tamanho++;
    }

    public void addQualquerPosicao(int posicao, E elemento) {
        if (posicao < 0 || posicao > tamanho) throw new IllegalArgumentException("Posição invalida");
        if (posicao == 0) addInicio(elemento);
        else if (posicao == tamanho - 1) addFinal(elemento);
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
        Node<E> encontrado = inicio.proximo;
        int posicao = 0;

        while (encontrado != null && !encontrado.elemento.equals(elemento)) {
            encontrado = encontrado.proximo;
            posicao++;
        }
        if (encontrado == null) return -1;
        return posicao;
    }

    public E removerFinal() {
        if (isEmpty()) throw new CollectionsEmptyException("Lista underflow");

        Node<E> removido = fim.anterior;
        Node<E> anterior = removido.anterior;
        anterior.proximo = fim;
        fim.anterior = anterior;
        removido.anterior = removido.proximo = null;
        tamanho--;

        return removido.elemento;
    }

    public E removerInicio() {
        if (isEmpty()) throw new CollectionsEmptyException("Lista underflow");

        Node<E> removido = inicio.proximo;
        Node<E> proximo = removido.proximo;
        proximo.anterior = inicio;
        inicio.proximo = proximo;
        removido.proximo= removido.anterior = null;
        tamanho--;

        return removido.elemento;
    }

    public E removerQualquerPosicao(int posicao) {
        if (isEmpty()) throw new CollectionsEmptyException("Lista underflow");
        if (posicao < 0 || posicao > tamanho) throw new IllegalArgumentException("Posição inválida");

        if (posicao == 0) return removerInicio();
        else if (posicao == tamanho - 1) return removerFinal();

        Node<E> anterior = buscarNo(posicao - 1);
        Node<E> removido = anterior.proximo;
        Node<E> proximo = removido.proximo;

        anterior.proximo = proximo;
        proximo.anterior = anterior;

        removido.proximo = removido.anterior = null;
        tamanho--;

        return removido.elemento;
        }
}
