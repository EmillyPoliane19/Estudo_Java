package src.classes.DesafioComida;

public class Pessoa {
    String nome;
    double peso;

    Pessoa (String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer (Comida comida){
        if (comida != null){
            this.peso += comida.peso;
        }
    }

    String status (){
        return nome + " tem " + peso + " Kgs";
    }

}
