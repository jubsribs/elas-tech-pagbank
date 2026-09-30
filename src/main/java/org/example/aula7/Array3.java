package org.example.aula7;

public class Array3 {
    static void main() {
        /*Com o mesmo array de notas, calcule e mostre a soma e a média.*/
        int[] notas = {8, 6, 10, 7, 9};
        int soma = 0;
        int media = 0;

        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }
        media = soma / notas.length;

        System.out.printf("Valor da soma: %d \n Valor da média: %d \n", soma, media);
    }
}
