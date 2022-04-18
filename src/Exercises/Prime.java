/* Número primo é aquele que só é divisível por ele mesmo e pela unidade. Faça um algoritmo que determine e escreva os números primos compreendidos entre um intervalo fornecido pelo usuário. */

package Exercises;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int start, end, prime = 0;

        Scanner entry = new Scanner(System.in);

        System.out.print("starting number: ");
        start = entry.nextInt();

        System.out.print("final number: ");
        end = entry.nextInt();

        for(int i = start; i <= end; i ++) {
            for(int j = 1; j <= i; j ++) {
                if(i % j == 0) {
                    prime ++;
                }
            }
            
            if(prime == 2) {
                System.out.println("the number " + i + " is PRIME!");

            }

            prime = 0;

        }

        entry.close();

    }
}
