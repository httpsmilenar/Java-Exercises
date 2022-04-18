/* Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Faça um algoritmo que calcule e escreva:
* a. a maior e a menor altura do grupo;
* b. média de altura dos homens;
* c. o número de mulheres.
*/

package Exercises;

import java.util.Scanner;

public class MensWomans {
    public static void main(String[] args) {
        int sex, amWomans = 0, amMens = 0;
        float height, sumM = 0, averageMens = 0, higher = 0, lower = 0;

        Scanner entry = new Scanner(System.in);

        for(int i = 0; i < 10; i ++) {
            System.out.print("choose the person's gender (1-woman, 2-men): ");
            
            sex = entry.nextInt();
            System.out.print("enter the height: ");
            
            height = entry.nextFloat();
            
            if(sex == 1) {
                amWomans ++;

            } else if(sex == 2) {
                amMens ++;
                sumM = sumM + height;

            } else {
                System.out.println("invalid option!");

            }

            if(height > higher) {
                higher = height;

            } else if(height < lower) {
                lower = height;
            }
        }

        averageMens = sumM / amMens;

        System.out.println("the greatest height of the group is " + higher + " m, and the smallest is " + lower + " m");
        System.out.println("the average height of men is " + averageMens + " m");
        System.out.println("the number of women is " + amWomans);

        entry.close();
    }
}