package org.example.aula13;

import java.util.ArrayList;

public class ForEach {
    static void main(){
        /*
        1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
   um por linha.
         */
        String [] nomes = {"Juliana","Claudia","Ana","Flora"};

        for( String nome : nomes){
            System.out.println(nome);
        }

        /*
        Crie um ArrayList com 5 notas e imprima todas usando for-each.
         */
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(5);
        notas.add(6);
        notas.add(8);
        notas.add(10);
        notas.add(12);

        for( Integer nota : notas){
            System.out.println(nota);
        }

        /*
        Com o array de notas {8, 6, 10, 7}, use for-each para somar
   todas e mostrar a soma e a média.
         */
        int [] nota = {8, 6, 10, 7};
        int soma=0;
        double media;

        for( Integer nota2 : nota){
                soma+=nota2;
        }
        media = soma / nota.length;
        System.out.println(" A soma das notas: " + soma + ". A média das notas: " + media);

        /*
        Com um array de nomes, use for-each e um if para contar quantos
   têm mais de 5 letras. Mostre o total. Dica: usem o método length.
         */
        int total=0;
        for( String nome : nomes){
            if(nome.length() > 5){
                total++;
            }
        }
        System.out.println("Total de nomes com mais de 5 letras: " + total);

        /*
        Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
           usando o índice. Deixe os dois na mesma classe e compare.
         */

        for(int i=0; i< nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
