package org.example.aula12;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ArrayDeque2 {
    static void main (){

        /*
            1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
               e quantas pessoas tem.
         */

        Deque<String> pessoas = new ArrayDeque<>();
        pessoas.add("Juliana");
        pessoas.add("Claudia");
        pessoas.add("Flora");

        System.out.println("Fila: " + pessoas);
        System.out.println( "Tamanho: "+ pessoas.size());

        /*
        2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
        imprima a fila logo depois. Repare que ela não mudou.
         */

        Deque<String> pessoas2 = new ArrayDeque<>();
        pessoas2.addAll(Arrays.asList("Juliana", "Claudia", "Flora", "Ana"));

        System.out.println("Próximo da fila: " + pessoas2.peek());
        System.out.println("Fila: " + pessoas2);

        /*
        3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
        depois. Compare com o exercício 2.
         */

        System.out.println("Atender o primeiro: " + pessoas2.poll());
        System.out.println("Fila: " + pessoas2);

        /*
        4. Crie uma fila com três nomes e atenda todos usando
        while (!fila.isEmpty()). No final, imprima "Fila vazia!".
         */
        Deque<String> fila = new ArrayDeque<>();

        fila.add("Juliana");
        fila.add("Maria");
        fila.add("Ana");

        while(!fila.isEmpty()){
            System.out.println("Atender: " + fila.poll());
        }

        System.out.println("Fila vazia!" + fila);

        /*
        5. Crie uma fila com três nomes e use contains para responder duas
        perguntas: se "Bia" está na fila e se "Zoe" está.
         */

        Deque<String> nome = new ArrayDeque<>();
        nome.add("Júlia");
        nome.add("Bruna");
        nome.add("Zoe");

        System.out.println("Bia está na fila? " + nome.contains("Bia"));
        System.out.println("Zoe está na fila? " + nome.contains("Zoe"));

            /*
            6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
               - se estiver vazia  -> "Não tem ninguém na fila."
               - se tiver gente    -> "Próximo: [nome]"
               Depois adicione uma pessoa e teste de novo.
     */

        Deque<String> filaQualquer = new ArrayDeque<>();
        //filaQualquer.add("Melissa");

        if(filaQualquer.isEmpty()){
            System.out.println("Não tem ninguém na fila.");
        }
        if(!filaQualquer.isEmpty()){
            System.out.println("Próximo: "+ filaQualquer.peek());
        }
    }
}
