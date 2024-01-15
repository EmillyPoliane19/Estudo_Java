package src.classes;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        System.out.println(d1.obterDataFormatada());

        Data d2 = new Data(28,8,2023);
        System.out.println(d2.obterDataFormatada());

    }
}
