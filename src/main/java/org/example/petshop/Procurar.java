package org.example.petshop;

import java.util.Scanner;

public class Procurar {
    Cadastro cadastro = new Cadastro();
    Scanner sc = new Scanner(System.in);

    void procurarPet( int contPet,Pet[] pets ) {

        if (cadastro.verificar(contPet)) {
            String nome;
            System.out.printf("Qual pet você procura? ");
            nome = sc.nextLine().toLowerCase();
            boolean encontrado = false;
            for (int i = 0; i < contPet; i++) {
                if ((pets[i].nome.toLowerCase()).equalsIgnoreCase(nome)) {
                    System.out.printf("Encontrado: %s(%s) - %.1f kg\n", pets[i].nome, pets[i].especie, pets[i].peso);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.printf("Pet não encontrado. \n");
            }
        }
    }
}
