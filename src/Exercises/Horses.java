/*Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa de m quilogramas a uma altura de h metros em t segundos. Considere cavalos = (m * h / t) / 745,6999. */

package Exercises;

public class Horses {
    public static void main(String[] args) {
        double m, h, t, horses;
        m = 21;
        h = 2.2;
        t = 1.4;

        horses = (m * h / t) / 745.6999;

        System.out.println("he number of horses needed is: " + horses);
    }
}
