package org.example.aula7;

import java.util.Scanner;

public class String4 {
    static void main(){
        /*Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.*/
        String frase;
        String palavra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();


        System.out.println("Digite uma palavra: ");
        palavra = sc.nextLine();

        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));
    }
}
