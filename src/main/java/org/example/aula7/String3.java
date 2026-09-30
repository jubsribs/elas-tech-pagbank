package org.example.aula7;

import java.util.Scanner;

public class String3 {
    static void main(){
        /*Peça o nome da pessoa e mostre a primeira letra dele.*/
        String nomeCompleto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome ");
        nomeCompleto = sc.nextLine();

        System.out.println("A primeira letra do seu nome: " + nomeCompleto.charAt(0));
    }
}
