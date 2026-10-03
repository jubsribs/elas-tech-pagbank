package org.example.aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao3 {
    static void main(){
        /*Peça a idade da pessoa com scanner.nextInt().
        Se ela digitar um texto em vez de um número, trate a InputMismatchException
         e mostre uma mensagem pedindo um número.
         */
        int idade;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println(" Digite sua idade:\n");
            idade = sc.nextInt();

            System.out.printf(" Sua idade é: %d\n",idade);
        } catch (InputMismatchException e) {
            System.out.printf("Digite apenas números.\n");
        }
    }
}
