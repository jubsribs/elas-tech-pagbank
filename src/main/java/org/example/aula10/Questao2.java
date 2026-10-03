package org.example.aula10;

import java.util.Scanner;

public class Questao2 {
    /*2 — Crie um array com 5 notas.
    Peça uma posição para a pessoa e mostre a nota daquela posição.
    Se a posição não existir, trate a ArrayIndexOutOfBoundsException
     e avise que o array só vai de 0 a 4.
     */
    static void main(){
        double[] notas = {9.5,9.8,9.7,8.6,8.1};
        Scanner sc = new Scanner(System.in);
        int i;

        try{
            System.out.printf(" Digite uma posição:\n");
            i = sc.nextInt();

            System.out.printf(" A nota dessa posição é: %.1f \n",notas[i]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.printf(" Posição inexistente, O array só vai de 0 até %d \n",(notas.length-1));
        }
    }
}
