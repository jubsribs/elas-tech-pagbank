package org.example.aula12;

import java.util.HashMap;

public class HashMap2 {
    static void main (){

        /*
        1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
       inteiro e depois use get para mostrar a idade de uma delas.
         */

        HashMap<String, Integer> idades = new HashMap<>();
        idades.put("Ana", 25);
        idades.put("Juliana", 28);
        idades.put("Maria", 27);

        System.out.println(idades);

        int idadeAna = idades.get("Ana");

        System.out.printf("A idade de Ana é %d. \n",idadeAna);

        /*
          2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
       imprima, e depois faça put de "café" DE NOVO com valor 7.50.
       Imprima outra vez e veja o que aconteceu com o tamanho.
         */

        HashMap<String, Double> produto = new HashMap<>();
        produto.put("café", 5.00);

        System.out.println(produto);
        produto.put("café", 7.50);
        System.out.println(produto);

        /*
            3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
               dentro de um if para mostrar o telefone de alguém que está na agenda
               e de alguém que não está.
         */

        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Ana", "99996-95599");
        agenda.put("Bruna", "98563-9895");
        agenda.put("Flora", "98563-9965");

            if(agenda.containsKey("Ana")){
                System.out.println("O numero de Ana: " + agenda.get("Ana"));
            }

        /*
            4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
               Use getOrDefault para mostrar a quantidade de um produto que existe
               e de um que não existe (devolvendo 0). Depois tente com get normal
               no que não existe e compare.
         */

        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("sabão", 2);
        estoque.put("amaciante", 5);

        System.out.println(estoque.getOrDefault("sabão", 0));
        System.out.println(estoque.get("vassoura"));

            /*
            5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
               Remova uma delas e imprima de novo.
     */

        HashMap<String, Double> notas = new HashMap<>();
        notas.put("Ana", 9.5);
        notas.put("Maria", 8.9);
        notas.put("Júlia", 7.9);

        System.out.println(notas.size());
        System.out.println(notas);

        notas.remove("Ana");
        System.out.println(notas);
    }
}
