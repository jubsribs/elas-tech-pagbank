package org.example.aula7;

import java.util.Scanner;

public class String1 {
    static void main(){
        /* Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).*/

        String nomeCompleto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome ");
        nomeCompleto = sc.nextLine();

        System.out.println("A quantidade de letras do seu nome é: " + nomeCompleto.length());
    }

}
