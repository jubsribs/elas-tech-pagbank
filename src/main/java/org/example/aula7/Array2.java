package org.example.aula7;

public class Array2 {
    static void main(){
        /*Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha,*/
        int[] notas = {8, 6, 10, 7, 9};

        for(int i=0; i<notas.length; i++){
            System.out.printf("Nota %d: %d \n",i,notas[i]);
    }
}

}
