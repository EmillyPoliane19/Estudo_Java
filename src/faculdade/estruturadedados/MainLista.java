package faculdade.estruturadedados;

public class MainLista {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>();
        System.out.println(lista.isEmpty());
        lista.adicionaInicio("Primeiro");
        lista.adicionUltimo("terceiro");
        lista.adicionUltimo("quarto");
        lista.adicionUltimo("Segundo");
        lista.adicionUltimo("quinto");
        System.out.println(lista.size());
        System.out.println(lista.buscar("Segundo"));
        System.out.println(lista.isEmpty());
        System.out.println(lista.buscar(4));
        lista.removerFinal();
        System.out.println(lista.buscar(5)); //Exceção
    }
}
