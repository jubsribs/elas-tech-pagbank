package org.example.listaModulo1.arrays;

import java.util.Scanner;

public class Arrays {
    static void main(){
        /*
        Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o último.
         */
        String [] nomes = {"Juliana","Claudia","Flora","Ana","Júlia"};

        System.out.printf("A primeira posição é %s. \n ",nomes[0]);
        System.out.printf("A terceira posição é %s .\n ",nomes[2]);
        System.out.printf("A última posição é %s. \n ",nomes[4]);

        /*
        Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laço.
         */
        int [] notas = {8, 6, 10, 7, 9};

        for(int i=0;i<notas.length;i++){
            System.out.printf("A nota na posição %d : é %d. \n ",i,notas[i]);
        }

        /*
        Com o mesmo array, calcule e imprima a soma e a média.
         */
        int soma = 0;
        double media;

        for(int i=0;i<notas.length;i++){
            soma += notas[i];
        }
        media = soma/ notas.length;

        System.out.printf("A soma de todas a notas é %d , a média das notas é %.2f. \n ",soma,media);

        /*
        Crie um array com 5 números e descubra qual é o maior.
         */

        int[] numeros = {8,6,7,12,9};
        int numeroMaior = 0;

        for(int i=0;i<numeros.length;i++){

            if(numeroMaior < numeros[i]){
                numeroMaior = numeros[i];
            }
        }
        System.out.printf(" O maior número é %d. \n",numeroMaior);

        /*
        Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7.
         */
        numeros = new int []{8, 5, 10, 4, 7};
        int cont = 0;

        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>=7){
                cont++;
            }
        }
        System.out.printf(" Existe %d maiores ou iguais a 7. \n",cont);

        /*
        Mini-desafio — Crie um array com 5 nomes.
        Peça um nome pra pessoa e diga em qual posição ele está. Se não estiver na lista, avise.
         */
        Scanner sc = new Scanner(System.in);
        String nomeUsuario;
        int posicao = -1;

        System.out.printf(" Digite um nome :\n");
        nomeUsuario = sc.nextLine();

        for(int i=0;i<nomes.length;i++){
            if(nomeUsuario.equals(nomes[i])){
                posicao = i;
            }
        }

        if(posicao!=-1) {
            System.out.printf("O nome está na posição: %d. \n",posicao);
        }

        else{
                System.out.printf("O nome não está na lista. \n");
        }

    }
}
