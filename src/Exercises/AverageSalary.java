/* Crie um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial. */

package Exercises;

public class AverageSalary {
    public static void main(String[] args) {
        double n1, n2, n3, n4, average;

        n1 = 3453.21;
        n2 = 3498.43;
        n3 = 7902.09;
        n4 = 12932.00;

        average = (n1 + n2 + n3 + n4) / 4;
        System.out.println("the average salary of the company is R$ " + average);
    }
    
}
