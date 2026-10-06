package org.example.listaModulo1.loops;

import java.util.Scanner;

public class Loops {
    static void main() {
        Scanner sc = new Scanner(System.in);
        /*
        Imprima os números de 1 a 20, um por linha.
         */
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d \n", i);
        }

        /*
        Imprima a contagem regressiva de 10 até 1 e depois "Fim!".
         */

        for (int i = 10; i >= 1; i--) {
            if (i <= 10 && i >= 1) {
                System.out.printf(" %d \n", i);
            } else {
                System.out.printf("Fim!.\n");
            }
        }

            /*
            Peça um número e mostre a tabuada dele de 1 a 10.
             */
        int numero;
        System.out.printf("Digite um número: \n");
        numero = sc.nextInt();

        for (int x = 1; x <= 10; x++) {
            System.out.printf(" %d X %d: %d \n", numero, x, (numero * x));
        }

            /*
            Imprima só os números pares de 1 a 30.
             */

        for (int y = 1; y <= 30; y++) {
            if (y % 2 == 0) {
                System.out.printf(" %d\n", y);
            }
        }

            /*
            Usando for, some todos os números de 1 a 100 e mostre o resultado.
             */
        int soma = 0;
        for (int a = 1; a <= 100; a++) {
            soma += a;
        }
        System.out.printf(" O resultado da soma é %d\n", soma);

            /*
            Refaça o primeiro exercício com while. Compare os dois códigos.
             */
        int z = 1;
        while (z <= 20) {
            System.out.printf("%d \n", z);
            z++;
        }
        // os dois códigos vão ser o mesmo , só muda a estrutura.

            /*
            Crie energia = 3. Usando do while, imprima "Jogando..." e diminua 1 enquanto for maior que 0.
             */
        int energia = 3;
        do {
            System.out.println("Jogando...");
            energia--;
        } while (energia > 0);

            /*
             Mini-desafio — Peça um número e desenhe um triângulo de asteriscos com essa altura.
             */

        int altura;

        System.out.printf("Digite um número: \n");
        altura = sc.nextInt();

        for (int c = 1; c <= altura; c++) {
            for (int b = 1; b <= c; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
