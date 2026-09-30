package org.example.aula7;

import java.util.Scanner;

public class String5 {
    static void main(){
        /*Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.*/
        String nome;
        String nome2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome ");
        nome = sc.nextLine();

        System.out.println("Digite seu Nome novamente ");
        nome2 = sc.nextLine();

        nome = nome.toLowerCase();
        nome2 = nome2.toLowerCase();

        System.out.println("Os nomes são iguais?: " + nome.contains(nome2));
    }
}
