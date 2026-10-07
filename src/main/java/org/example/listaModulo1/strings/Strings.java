package org.example.listaModulo1.strings;

import java.util.Scanner;

public class Strings {
    static void main(){

        /*
        Peça o nome completo e mostre quantas letras ele tem.
         */
        String nomeCompleto;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite seu nome Completo: \n ");
        nomeCompleto = sc.nextLine();

        System.out.printf("O nome tem %d letras. \n ",nomeCompleto.length());

        /*
        Peça o nome e mostre em MAIÚSCULO e em minúsculo.
         */
        String nome;

        System.out.printf("Digite um nome: \n ");
        nome = sc.nextLine();

        System.out.printf("O nome em MAIÚSCULO: %s , em minúsculo: %s.\n ",nome.toUpperCase(),nome.toLowerCase());

        /*
        Peça o nome e mostre a primeira letra.
         */

        System.out.printf("Digite um nome: \n ");
        nome = sc.nextLine();

        System.out.printf("A primeira letra do nome é: %s \n",nome.charAt(0));

        /*
        Peça uma frase e uma palavra. Diga se a palavra aparece na frase.
         */

        String frase,palavra;

        System.out.printf("Digite uma frase: \n ");
        frase = sc.nextLine();

        System.out.printf("Digite uma palavra: \n ");
        palavra = sc.nextLine();
        System.out.printf("A palavra contém na frase? %b \n",frase.contains(palavra));



    }
}
