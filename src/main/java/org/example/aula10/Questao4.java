package org.example.aula10;

public class Questao4 {

    static void main(){
        /*Crie uma variável String nome = null; e tente imprimir nome.length().
        Trate a NullPointerException e mostre "O nome não foi preenchido."
         */

        String nome = null;

        try{
            System.out.printf(" tamanho do nome: %d\n",nome.length());
        } catch (NullPointerException e) {
            System.out.printf("O nome não foi preenchido.");
        }
    }
}
