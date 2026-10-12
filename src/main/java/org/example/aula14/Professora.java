package org.example.aula14;

public class Professora extends Pessoa{
    String disciplina;

    void lancarNota(String aluna, double nota){

        System.out.printf(" %s lançou nota %.1f para %s.\n",nome,nota,aluna);

    }

    @Override
    void apresentar(){

        System.out.printf("Oi, sou %s e ensino %s.\n",nome,disciplina);
   }
}
