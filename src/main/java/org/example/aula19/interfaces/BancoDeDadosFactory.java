package org.example.aula19.interfaces;

public class BancoDeDadosFactory {

    public static BancoDeDados criar(int opcao){
        if(opcao == 1){
           return new MySql();
        } else if (opcao == 2) {
            return new MongoDB();
        }
        else {
            throw new IllegalArgumentException("Opção Inválida");
        }
    }
}
