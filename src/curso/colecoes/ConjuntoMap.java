package curso.colecoes;
import java.util.HashMap;
import java.util.Map;

public class ConjuntoMap {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Felipe");
        usuarios.put(2, "Fernando");
        usuarios.put(3, "Bruna");
        usuarios.put(4, "Emilly");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.values());
        System.out.println(usuarios.containsKey(4));

        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsValue("Fernando"));

        System.out.println(usuarios.get(3));

        for (Map.Entry<Integer,String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " -> ");
            System.out.println(registro.getValue());
        }
    }
}
