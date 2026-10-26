package org.example.petshop;

import java.util.HashSet;

public class Lista extends Pet {
    Cadastro cadastro = new Cadastro();
    HashSet<String> especies = new HashSet<>();

    void listarPet(int contPet, Pet[] pets){
        if (cadastro.verificar(contPet)) {
            System.out.println("\n=== PETS CADASTRADOS ===");
            for (int i = 0; i < contPet; i++) {
                System.out.printf("%s( %s ) - %.1f kg - %s \n", pets[i].nome, pets[i].especie, pets[i].peso, pets[i].porte);
                pets[i].emitirSom();
            }
        }
    }

    void listarEspecie(Pet[] pets, int contPet){

        if (cadastro.verificar(contPet)) {
            for (int i = 0; i < contPet; i++) {
                especies.add(pets[i].especie);
            }
            System.out.println("--- ESPÉCIES CADASTRADAS ---");
            for (String conjunto : especies) {
                System.out.println("- " + conjunto);
            }
            System.out.println("Total de espécies diferentes: " + especies.size());
        }
    }
}
