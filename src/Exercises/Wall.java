/* Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada. */

package Exercises;

public class Wall {
    public static void main(String[] args) {
        double hp, lp, ha, la, amt;

        hp = 2.6;
        lp = 1.6;
        ha = 0.35;
        la = 0.3;

        amt = (hp * lp) / (ha * la);

        System.out.println("the amount of tiles needed to cover the wall is: " + amt);
    }
}
