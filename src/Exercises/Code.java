/* Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’. */

package Exercises;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        int code, password;
        Scanner entry = new Scanner(System.in);

        System.out.print("enter access code: ");
        code = entry.nextInt();

        if(code == 1234) {
            System.out.print("enter access password: ");
            password = entry.nextInt();

            if(password == 9999) {
                System.out.println("allowed access!");

            } else {
                System.out.println("ERROR. incorrect password!");
            
            }

    } else {
        System.out.println("ERROR. incorrect code!");
    }

    entry.close();

    }
}
