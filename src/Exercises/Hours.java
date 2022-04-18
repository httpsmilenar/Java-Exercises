/* Escrever um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois, determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s e a quantidade de segundos que faltam para a meia-noite. */

package Exercises;

public class Hours {
    public static void main(String[] args) {
        int hour, minute, second, past, missing;

        hour = 3;
        minute = 32;
        second = 54;

        past = second + minute * 60 + hour * 3600;
        missing = 86400 - past;

        System.out.println("already passed " + past + "seconds from the start of the day");
        System.out.println("missing " + missing + "seconds to end the day");
    }
}
