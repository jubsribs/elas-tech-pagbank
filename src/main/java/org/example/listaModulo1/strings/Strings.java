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

        /*
        Peça o nome duas vezes e diga se os dois são iguais, ignorando maiúsculas.
         */

        String nome2,nome3;

        System.out.printf("Digite um Nome: \n ");
        nome2 = sc.nextLine();
        nome2=nome2.toUpperCase();

        System.out.printf("Digite outro Nome: \n ");
        nome3 = sc.nextLine();
        nome3=nome3.toUpperCase();

        if(nome2.equals(nome3)){
            System.out.printf("Os nomes são iguais. \n ");
        }

        else{
            System.out.printf("Os nomes não são iguais. \n ");
        }
        /*
        Peça um nome e mostre em maiúsculo, sem espaços nas pontas (dois métodos encadeados).
         */
        String nome4;

        System.out.printf("Digite um Nome: \n ");
        nome4 = sc.nextLine();
        nome4=nome4.trim().toUpperCase();

        System.out.printf("Nome formatado: %s \n ",nome4);

        /*
        Mini-desafio — Peça uma palavra e diga se ela começa e termina com a mesma letra,
        ignorando maiúscula e minúscula.
         */

        String palavra2;

        System.out.printf("Digite uma palavra: \n ");
        palavra2= sc.nextLine();
        palavra2 = palavra2.toUpperCase();


                if(palavra2.charAt(0) == palavra2.charAt(palavra2.length()-1)){
                    System.out.printf("A palavra começa e termina com a mesma letra. \n ");
                }
                else{
                    System.out.printf("A palavra não começa e não termina com a mesma letra. \n ");
                }


    }
}
