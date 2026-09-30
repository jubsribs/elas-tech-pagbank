package org.example.aula7;

import java.util.Scanner;

public class Array4 {
    static void main() {
        /*Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.*/
        int[] notas = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite um numero: \n");
            notas[i] = sc.nextInt();
        }

        for (int i = notas.length-1; i>=0; i--) {
            System.out.println(notas[i]);
        }

    }
}
