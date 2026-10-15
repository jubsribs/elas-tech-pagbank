package org.example.petshop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Petshop {
    static void main (){
        int opcao = -1;
        int contPet=0;

        Pet [] pets = new Pet[5];
        Scanner sc = new Scanner(System.in);

        while(opcao!=0) {
            System.out.printf("  === PETSHOP ===\n 1 - Cadastrar pet \n 2 - Listar pets \n 3 - Buscar PET \n 0 - Sair \n");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao){
                    case 1:
                        pets [contPet] = new Pet();

                        System.out.println("Digite o nome do PET: ");
                        pets[contPet].nome = sc.nextLine();

                        System.out.println("Digite a espécie do PET: ");
                        pets[contPet].especie = sc.nextLine().toLowerCase();

                        System.out.println("Digite o peso do PET: ");
                        pets[contPet].peso = sc.nextDouble();

                        pets[contPet].porte = pets[contPet].definirPorte(pets[contPet].peso);

                        contPet++;

                        System.out.println("Pet cadastrado! Agora são " + contPet +" pet(s).");
                        break;
                    case 2:
                        if (contPet == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println("\n=== PETS CADASTRADOS ===");
                            for (int i = 0; i < contPet; i++) {
                                System.out.printf("%s( %s ) - %.1f kg - %s \n",pets[i].nome,pets[i].especie,pets[i].peso,pets[i].porte);
                            }
                        }
                        break;
                    case 3:
                        if (contPet == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        }
                        else {
                            String nome;
                            System.out.printf("Qual pet você procura? ");
                            nome = sc.nextLine().toLowerCase();
                            boolean encontrado = false;

                            for (int i = 0; i < contPet; i++) {
                                if ((pets[i].nome.toLowerCase()).equalsIgnoreCase(nome)) {
                                    System.out.printf("Encontrado: %s(%s) - %.1f kg\n",pets[i].nome,pets[i].especie,pets[i].peso);
                                    encontrado = true;
                                }
                            }
                            if (!encontrado) {
                                System.out.printf("Pet não encontrado. \n");
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;

                }
        } catch (InputMismatchException e) {
                System.out.println("Só é possível digitar números!");
                sc.nextLine();
                opcao = -1;
            }

        }
    }
}
