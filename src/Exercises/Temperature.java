/*  Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:
*  F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67.
*/

package Exercises;

public class Temperature {
    public static void main(String[] args) {
        double C, K, F, Re, Ra;
        C = 2.43;

        F = C * 1.8 + 28;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;


        System.out.println("the temperature in Fahrenheit is: " + F);
        System.out.println("the temperature in Kelvin is: " + K);
        System.out.println("the temperature in Reaumur in: " + Ra);
        System.out.println("the temperature in Rankine in: " + Re);
    }
}