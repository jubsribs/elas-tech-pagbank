package org.example.petshop;

import java.util.Scanner;

public class Cadastro{
    Scanner sc = new Scanner(System.in);

    Integer cadastrar(int contPet, Pet[] pets ){

        if (contPet > 5) {
            System.out.println( "Cadastro cheio!");
        }
        else {
            System.out.println("Digite o nome do PET: ");
            pets[contPet].nome = sc.nextLine();

            System.out.println("Digite a espécie do PET: ");
            String especie = sc.nextLine().toLowerCase();

            if (especie.equals("cachorro")) {
                pets[contPet].especie = new Cachorro().toString();
            } else if (especie.equals("gato")) {
                pets[contPet].especie = new Gato().toString();
            } else {
                pets[contPet].especie = new Pet().toString();
            }
            pets[contPet].especie = especie;

            System.out.println("Digite o peso do PET: ");
            pets[contPet].peso = sc.nextDouble();

            sc.nextLine();

            pets[contPet].porte = pets[contPet].definirPorte(pets[contPet].peso);
            contPet++;
        }
        return contPet;
    }

    boolean verificar (int contPet){
        boolean verificar = true;
        if (contPet == 0) {
            System.out.println("Nenhum pet cadastrado.");
            verificar = false;
        }
        return verificar;
    }

}
