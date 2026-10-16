package org.example.petshop;

public class Vacina implements Servico{

        @Override
        public void executar(String nomePet) {
            System.out.println("Vacinando " + nomePet + "...");
        }
}
