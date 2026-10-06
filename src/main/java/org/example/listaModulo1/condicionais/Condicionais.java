package org.example.listaModulo1.condicionais;

import java.util.Scanner;

public class Condicionais {
    static void main(){
        /*Peça a idade e diga se a pessoa é maior ou menor de idade.
         */
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.printf(" Digite sua idade: \n");
        idade = sc.nextInt();

        if(idade>=18){
            System.out.printf(" Você é de maior! \n");
        }
        else{
            System.out.printf(" Você ainda não é de maior! \n");
        }

        /*Peça um número e diga se ele é par ou ímpar.
         */

        int numero;
        System.out.printf(" Digite um número: \n");
        numero = sc.nextInt();

        if((numero%2)==0){
            System.out.printf(" Esse número é par! \n");
        }
        else{
            System.out.printf("Esse número é ímpar! \n");
        }

        /*Peça dois números e diga qual é o maior. Se forem iguais, avise.
         */

        int n1,n2;

        System.out.printf(" Digite um número: \n");
        n1 = sc.nextInt();

        System.out.printf(" Digite outro número: \n");
        n2 = sc.nextInt();

        if(n1>n2){
            System.out.printf(" %d é o número maior! \n",n1);
        }
        else if(n2>n1){
            System.out.printf(" %d é o número maior! \n",n2);
        }
        else if(n1==n2){
            System.out.printf(" %d e %d são iguais! \n",n1,n2);
        }
        else{
            System.out.printf(" %d e %d são diferentes! \n",n1,n2);
        }

        /*Peça uma nota e mostre "Aprovada" (7 ou mais), "Recuperação" (5 a 6.9) ou "Reprovada".
         */

        double nota;

        System.out.printf(" Digite sua nota: \n");
        nota = sc.nextDouble();

        if(nota>=7){
            System.out.printf(" Aprovada \n");
        }
        else if(nota>=5 && nota<=6.9){
            System.out.printf(" Recuperação \n");
        }
        else{
            System.out.printf(" Reprovada \n");
        }

        /*Peça um número de 1 a 3 e, usando switch, mostre um sabor de sorvete pra cada opção.
         */

        int numero2;

        System.out.printf(" Digite um número de 1 a 3: \n");
        numero2 = sc.nextInt();

        switch (numero2){
            case 1:
                System.out.printf(" Chocolate \n");
                break;
            case 2:
                System.out.printf(" Baunilha \n");
                break;
            case 3:
                System.out.printf(" Limão \n");
                break;
            default:
                System.out.printf(" Número Inválido! \n");
        }

        /*Peça a idade e diga o valor do ingresso: menos de 12 ou 60 ou mais paga R$ 10; o resto paga R$ 25.
         */
        int idade2;

        System.out.printf(" Digite sua idade: \n");
        idade2 = sc.nextInt();

        if(idade2<12 || idade >60){
            System.out.printf(" O ingresso vale R$10. \n");
        }
        else{
            System.out.printf(" O ingresso vale R$25. \n");
        }

        /*Mini-desafio — Peça os três lados de um triângulo e classifique:
        todos iguais → Equilátero; dois iguais → Isósceles; todos diferentes → Escaleno.
         */

        int lado1,lado2,lado3;

        System.out.printf(" Digite o número do lado de um triângulo: \n");
        lado1 = sc.nextInt();

        System.out.printf(" Digite o número do outro lado de um triângulo: \n");
        lado2 = sc.nextInt();

        System.out.printf(" Digite o número do último lado de um triângulo: \n");
        lado3 = sc.nextInt();

        if(lado1==lado2 && lado2==lado3 && lado1==lado3){
            System.out.printf(" Esse triângulo é Equilátero! \n");
        } else if ( lado1!=lado2 && lado2!=lado3 && lado1!=lado3) {
            System.out.printf(" Esse triângulo é Escaleno! \n");
        }
        else{
            System.out.printf(" Esse triângulo é Isósceles!\n");
        }


    }
}
