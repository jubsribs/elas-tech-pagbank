package org.example.aula13;

public class Cachorro implements Animal{
            /*
    Crie a classe Cachorro que implementa ela e imprime "Au au!".
   Na Main, crie um cachorro e chame o método. Não esqueça do @Override.
     */

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
