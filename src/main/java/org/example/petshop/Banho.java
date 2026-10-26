package org.example.petshop;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Banho implements Servico{
    Cadastro cadastro = new Cadastro();
    Scanner sc = new Scanner(System.in);

    @Override
    public void executar(String nomePet) {
        System.out.println("Dando banho em " + nomePet + "...");
    }

    void filaDoBanho( int contPet,ArrayDeque fila){
        if (cadastro.verificar(contPet)) {
            String nomeBanho;
            System.out.println("Nome do pet pra entrar na fila: ");
            nomeBanho = sc.nextLine();
            fila.add(nomeBanho);
            System.out.println(nomeBanho + " entrou na fila. ");
            System.out.println(" Fila agora: " + fila);
        }
    }

    void proximoBanho(ArrayDeque fila){
        if(fila.isEmpty()){
            System.out.println("A fila está vazia.");
        }
        else{
            String proximo = fila.peek().toString();
            System.out.println("Próximo da fila: " + proximo);
            String atendido = fila.poll().toString();
            System.out.println("Atendendo " + atendido + "...");
            System.out.println(" Fila agora: " + fila);
        }
    }
}
