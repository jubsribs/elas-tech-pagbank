package org.example.aula5;

import java.util.Scanner;

public class EstruturaRepeticao {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int senha = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Volta" + i);
        }

       /* while(senha != 1234){
            System.out.println("Digite a sua senha: ");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso Liberado!");
    }*/

        do {
            System.out.println("Digite a sua senha: ");
            senha = scanner.nextInt();
        } while (senha != 1234);
        System.out.println("Acesso Liberado!");
    }
}
