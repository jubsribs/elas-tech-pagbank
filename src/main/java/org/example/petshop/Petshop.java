package org.example.petshop;

import java.util.*;

public class Petshop {
    static void main (){
        int opcao = -1;
        int contPet=0;

        Pet [] pets = new Pet[5];
        Scanner sc = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        Lista lista = new Lista();
        Procurar procurar = new Procurar();
        Banho banho = new Banho();

        ArrayDeque<String> fila = new ArrayDeque<>();
        ArrayList <Servico> servico = new ArrayList<>();

        while(opcao!=0) {
            System.out.printf("  === PETSHOP ===\n " +
                    "1 - Cadastrar pet \n" +
                    "2 - Listar pets \n " +
                    "3 - Buscar PET \n " +
                    "4- Espécies Cadastradas \n " +
                    "5 - Entrar na fila de banho \n " +
                    "6 - Atender o próximo \n  " +
                    "7 - Banho/Tosa/Consulta/Vacina \n  " +
                    "8 - Quantidade de Pet Cadastrados \n  " +
                    "0 - Sair \n");

            try {
                opcao = sc.nextInt();
                sc.nextLine();
                switch (opcao){
                    case 1:
                        pets [contPet] = new Pet();
                        contPet = cadastro.cadastrar(contPet,pets);
                        System.out.println("Pet cadastrado com Sucesso!");
                        break;
                    case 2:
                            lista.listarPet(contPet,pets);
                        break;
                    case 3:
                             procurar.procurarPet(contPet,pets);
                        break;
                    case 4:
                            lista.listarEspecie(pets, contPet);
                        break;
                    case 5:
                            banho.filaDoBanho(contPet,fila);
                        break;
                    case 6:
                        banho.proximoBanho(fila);
                        break;
                    case 7:
                        String nome;
                        System.out.println("Nome do pet: ");
                        nome= sc.nextLine();
                        servico.add(new Banho());
                        servico.add(new Tosa());
                        servico.add(new Consulta());
                        servico.add(new Vacina());
                        for (Servico item : servico) {
                            item.executar(nome);
                        }
                        break;
                    case 8:
                        System.out.println("Tem " + contPet +" pet(s) cadastrados.");
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

    void fichaPet(Pet pet){
        System.out.println("Nome: " + pet.nome);
    }
    void fichaPet(Pet pet, String titulo){
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.println("Peso: " + pet.peso);
        System.out.println("Porte: " + pet.porte);

    }
}
