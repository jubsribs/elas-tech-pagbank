package org.example.aula10;

import java.util.Scanner;

public class Questao5 {

    static void main(){
        /* Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número.
        Trate a ArithmeticException para o caso de ela digitar 0.
         */

        int numero;
        int resto;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.printf(" Digite um numero:\n");
            numero = sc.nextInt();

            resto = 100%numero;

            System.out.printf(" O resto da divisão é %d \n", resto);

        } catch (ArithmeticException e) {

            System.out.printf(" Não é possível a divisão por 0.");
        }
    }
}
