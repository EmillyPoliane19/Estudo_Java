package diversos.lista3;

import java.util.Scanner;

/**Construir um programa que lê a hora de início de um jogo e a hora do final do jogo no
 formato hh:mm (hh: horas, mm: minutos) e calcule a duração do jogo,sabendo-se que o tempo máximo
 de duração do jogo é de 24 horas e que o jogo inicia e terminar no mesmo dia.*/

public class ExercLista3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);

        System.out.println("Início do jogo:");
        String horaInicial = sc.next();

        System.out.println("Fim do jogo:");
        String horaFinal = sc.next();

        //Separa a hora e os minutos usando split
        String[] parteInicio = horaInicial.split(":");
        String[] parteFinal = horaFinal.split(":");

        //Separa a hora e os minutos e converte em uma variável int
        int horaInicio = Integer.parseInt(parteInicio[0]);
        int minutoInicio = Integer.parseInt(parteInicio[1]);

        int horaFim = Integer.parseInt(parteFinal[0]);
        int minutoFim = Integer.parseInt(parteFinal[1]);

        //Transforma hora em minutos e junta todos os minutos
        int totalMinutosInicio = horaInicio * 60 + minutoInicio;
        int totalMinutosFinal = horaFim * 60 + minutoFim;

        //Converter minuto em hora
        int horaTotal = (totalMinutosFinal - totalMinutosInicio)/60;
        int minutoTotal = (totalMinutosFinal-totalMinutosInicio) % 60;

        System.out.printf("Duração do jogo: %d:%d", horaTotal,minutoTotal);
    }
}
