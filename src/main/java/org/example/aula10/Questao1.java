package org.example.aula10;

import java.util.Scanner;

public class Questao1 {

    /*Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo.
     Se a pessoa digitar 0 no segundo, trate a ArithmeticException
     e mostre uma mensagem explicando que não dá pra dividir por zero.
     */

    static void main(){
        int n1,n2,resultado;

        Scanner sc = new Scanner(System.in);

        try{
            System.out.printf(" Digite um número:\n");
            n1 = sc.nextInt();

            System.out.printf(" Digite outro número:\n");
            n2 = sc.nextInt();

            resultado = n1/n2;
            System.out.printf(" O resultado é : %d",resultado);
        }catch (ArithmeticException e){

            System.out.printf(" Não é possível a divisão por 0.");
        }

    }
}
