package org.example.aula11;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    static void main(){
        /*- Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
         */

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Claudia");
        lista.add("Juliana");
        lista.add("Flora");
        System.out.println(lista);

        /*  - Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
         */
        ArrayList<String> frutas = new ArrayList<>(List.of("maçã","melancia","goiaba","caju"));
        System.out.printf("A primeira fruta: %s, a última fruta: %s, o tamanho do array: %d \n",frutas.get(0),frutas.get(3),frutas.size());

        /*    - Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
         */
        ArrayList<String> nomes = new ArrayList<>(List.of("Claudia","Juliana","Flora","Ana"));
        System.out.println("Lista antes :" + nomes);
        nomes.set(2,"Jocelina");
        System.out.println("Lista depois :"+ nomes);

        /*Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
         */
        ArrayList<String> cidades = new ArrayList<>(List.of("Salvador","São Paulo","Rio de Janeiro","Recife"));
        System.out.println("Lista antes :" + cidades);
        cidades.remove(1);
        System.out.println("Lista depois da remoção :" + cidades);

        /*Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)
         */

        ArrayList<String> nomesCompletos = new ArrayList<>(List.of("Claudia","Juliana","Flora","Ana","Jenifer","Carol"));

        for(int i=0; i<nomesCompletos.size();i++){
            System.out.printf(" %d: %s\n",i,nomesCompletos.get(i));
        }

        /*Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.
         */

        ArrayList<String> nomesDois = new ArrayList<>(List.of("Claudia","Juliana","Flora","Ana","Jen"));
        Scanner sc = new Scanner(System.in);
        String nome;
        boolean temNome;

        System.out.printf(" Digite seu nome: \n");
        nome = sc.nextLine();

        temNome = nomesDois.contains(nome);

        if(temNome){
            System.out.printf(" %s está na lista, na posição %d\n", nome,nomes.indexOf(nome));
        }
        else{
            System.out.printf(" %s não está na lista\n", nome);
        }




    }
}

