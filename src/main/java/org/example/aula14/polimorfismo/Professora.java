package org.example.aula14.polimorfismo;

import org.example.aula14.herança.Pessoa;

/*
Crie a classe Professora, também filha de Pessoa, com o atributo
   disciplina e o método lancarNota(String aluna, double nota), que
   imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
   com %.1f.

   Na Main, crie uma aluna e uma professora e dê valor aos atributos
   de cada objeto:

   Professora flora = new Professora();
   flora.nome = "Flora";
   flora.idade = 30;
   flora.disciplina = "Java e IA";

   Faça o mesmo com a aluna e chame os métodos das duas.
 */
public class Professora extends Pessoa {

    String disciplina;

    void lancarNota(String aluna, double nota){
        System.out.printf(" %s lançou nota %.1f para %s\n",nome,nota,aluna);
    }

    void apresentar(String cargo) {
        System.out.println("Oi, sou " + nome + ", " + cargo);
    }
}
