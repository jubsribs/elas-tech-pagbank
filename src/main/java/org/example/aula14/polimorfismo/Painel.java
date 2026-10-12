package org.example.aula14.polimorfismo;

/*
Crie a classe Painel com QUATRO métodos chamados exibir, cada um
   recebendo um tipo diferente: String, int, boolean e double.
   Cada um imprime de um jeito, dizendo que tipo recebeu.

   Chame os quatro.

   Depois pense: por que o System.out.println() aceita texto, número,
   boolean e objeto, ao invés de ter um método println para cada? É exatamente isso que vocês acabaram de fazer.
 */
public class Painel {

    void exibir(String tipo){
        System.out.println("Recebi o tipo STRING " + tipo);
    }
    void exibir(int tipo){
        System.out.println("Recebi o tipo INTEIRO " + tipo);

    }
    void exibir(double tipo){
        System.out.println("Recebi o tipo DOUBLE " + tipo);

    }
    void exibir(boolean tipo){
        System.out.println("Recebi o tipo BOOLEAN " + tipo);

    }
}
