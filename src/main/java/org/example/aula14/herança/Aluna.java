package org.example.aula14.herança;

public class Aluna extends Pessoa {
    public String curso;

    public void estudar(){

        System.out.println(nome + " está estudando " +  curso);
    }
}
