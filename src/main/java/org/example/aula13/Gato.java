package org.example.aula13;

public class Gato implements Animal{
            /*
    Agora acrescente a classe Gato, que implementa a mesma interface e
   imprime "Miau!". Na main, declare as duas variáveis como Animal:

   Animal bidu = new Cachorro();
   Animal salem= new Gato();

   Chame emitirSom() nas duas.
     */
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}
