package src.classes;

public class Data {
    int dia;
    int mes;
    int ano;

    Data () {
        this(1,1,1970);
        //this() se torna um método, so poderá usar dentro de um construtor
        //dia = 1;
        //mes = 1;
        //ano = 1970;
    }
    Data (int dia,int mes,int ano){
        //(int diaInicial,int mesInicial,int anoInicial)
        //--> Adicionando o this altera a variável de instância.
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada () {
        return String.format("%d/0%d/%d",dia,mes,ano);
    }
}
