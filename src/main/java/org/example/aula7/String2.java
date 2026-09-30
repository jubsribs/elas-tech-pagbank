package org.example.aula7;

import java.util.Scanner;

public class String2 {
    static void main(){
        /*Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.*/
        String nomeCompleto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome ");
        nomeCompleto = sc.nextLine();

        System.out.println("Todo maiúsculo: " + nomeCompleto.toUpperCase());
        System.out.println("Todo minusculo: " + nomeCompleto.toLowerCase());
    }
}
