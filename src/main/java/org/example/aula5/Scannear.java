package org.example.aula5;

import java.util.Scanner;

public class Scannear {
    static void main() {
        Animal gato = new Animal();
        Animal cachorro = new Animal();
        Veiculo fiatUno = new Veiculo();
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;


        fiatUno.qtdPortas = 4;
        fiatUno.marca = "Fiat";

        System.out.println("Escreva seu nome");
        nome = sc.nextLine();
        System.out.println("Seu nome é " +  nome);

        System.out.println("Escreva sua idade");
        idade = sc.nextInt();
        System.out.println("Sua idade é " +  idade);


    }
}
