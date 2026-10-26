package org.example.petshop;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte ="Grande";


    String definirPorte (double peso) {

        if (peso < 10) {
            porte = "Pequeno";
        } else if (peso <= 10 && peso < 25) {
            porte = "Médio";
        } else if (peso > 25) {
            porte = "Grande";
        }
        return porte;
    }

    void emitirSom(){
            System.out.println( nome + " emite algum som ...");
    }
}
