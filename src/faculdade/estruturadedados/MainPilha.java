package faculdade.estruturadedados;

public class MainPilha {
    public static void main(String[] args) {
        //Pilhas com vetores
        Pilha<Integer> pilha = new Pilha<>();
        System.out.println("PILHA COM VETORES");
        System.out.println("is Empty Deve ser true: " + pilha.isEmpty());

        pilha.push(19);

        System.out.println("is Empty deve ser false: " + pilha.isEmpty());

        pilha.push(4);
        pilha.push(5);
        pilha.push(3);

        System.out.println("Topo deve ser 3: " + pilha.peek());
        System.out.println("Tamanho deve ser 4: " + pilha.size());

        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        System.out.println("Tamanho deve ser  0: " + pilha.size());
        pilha.push(4);
        pilha.push(5);
        pilha.push(7);
        pilha.push(8);
        pilha.push(19);
        pilha.push(9);
        pilha.push(0);
        pilha.push(25);
        System.out.println("Topo deve ser 25: " + pilha.peek());

        //Pilha com encadeamento
        PilhaEncadeada<Integer> pilhaEncadeada = new PilhaEncadeada<>();

        System.out.println("PILHA COM ENCADEAMENTO");

        System.out.println("is Empty Deve ser true: " + pilhaEncadeada.isEmpty());

        pilhaEncadeada.push(19);

        System.out.println("is Empty deve ser false: " + pilhaEncadeada.isEmpty());

        pilhaEncadeada.push(4);
        pilhaEncadeada.push(5);
        pilhaEncadeada.push(3);

        System.out.println("Topo deve ser 3: " + pilhaEncadeada.peek());
        System.out.println("Tamanho deve ser 4: " + pilhaEncadeada.size());

        pilhaEncadeada.pop();
        pilhaEncadeada.pop();
        pilhaEncadeada.pop();
        pilhaEncadeada.pop();
        System.out.println("Tamanho deve ser  0: " + pilhaEncadeada.size());
        pilhaEncadeada.push(4);
        pilhaEncadeada.push(5);
        pilhaEncadeada.push(7);
        pilhaEncadeada.push(8);
        pilhaEncadeada.push(19);
        pilhaEncadeada.push(9);
        pilhaEncadeada.push(0);
        pilhaEncadeada.push(25);
        System.out.println("Topo deve ser 25: " + pilhaEncadeada.peek());

    }
}
