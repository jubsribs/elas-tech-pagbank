package org.example.aula12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSet2 {
    static void main (){

        /*
        1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
           repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
           com o repetido.
         */
        HashSet<String> nomes = new HashSet<String>();
        nomes.add("Ana");
        nomes.add("Juliana");
        nomes.add("Flora");
        nomes.add("Ana");

        System.out.println( "Tamanho: "+ nomes.size());
        System.out.println("Conjunto: " + nomes);

        /*
        2. Crie um HashSet de cores usando addAll. Depois use contains dentro
        de um if para avisar se a cor "verde" já está no conjunto ou não.
         */

        HashSet<String> cores = new HashSet<String>();
        cores.addAll(Arrays.asList("azul", "vermelho", "verde", "amarelo"));

        if(cores.contains("verde")){
            System.out.println("A cor verde está no conjunto");
        }
        else{
            System.out.println("A cor verde não está no conjunto");
        }

        /*
        3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
            tirar os repetidos. Imprima os dois e compare.
         */

        ArrayList<String> lista = new ArrayList<>(List.of("Claudia","Juliana","Juliana","Claudia"));
        HashSet<String> conjunto = new HashSet<String>(lista);

        System.out.println("ArrayList: " + lista);
        System.out.println("HashSet: " + conjunto);

        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Tamanho do conjunto: " + conjunto.size());

        /*
        4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
            imprima de novo, junto com o tamanho.
         */
        HashSet<String> cpf = new HashSet<String>();

        cpf.add("258.956.956-64");
        cpf.add("789.652.659-53");
        cpf.add("896.324.695-85");

        System.out.println("Lista de cpf: " + cpf);
        cpf.remove("789.652.659-53");
        System.out.println("Depois da remoção: " + cpf);
        System.out.println("Tamanho da lista: " + cpf.size());

        /*
        5. Crie um HashSet com três frutas e percorra ele com for,
           imprimindo uma por linha.
         */
        HashSet<String> frutas = new HashSet<String>();
        frutas.add("abacaxi");
        frutas.add("maça");
        frutas.add("banana");

        for (String i : frutas){
            System.out.println(i);
        }

    /*
        6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
           imprima o isEmpty() de novo.
     */
        HashSet<Integer> qualquer = new HashSet<Integer>();

        System.out.println(qualquer.isEmpty());

        qualquer.add(3);

        System.out.println(qualquer.isEmpty());
    }
}
