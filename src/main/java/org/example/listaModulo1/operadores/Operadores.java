package org.example.listaModulo1.operadores;

public class Operadores {
    static void main(){
        /*Crie a = 15 e b = 4 . Imprima a soma, a subtração, a multiplicação, a divisão e o
        resto.
         */

        int a = 15;
        int b = 4;

       System.out.printf("A soma é %d, subtração é %d, multiplicação é %d, a divisão é %d e o resto é %d\n",(a+b),(a-b),(a*b),(a/b),(a%b));

         /*
        Crie saldo = 1000 . Use += para somar 250 e -= para tirar 380. Imprima o saldo
        final.
         */

        int saldo = 1000;
        saldo+=250;
        saldo-=380;
        System.out.printf("O saldo final é %d\n",saldo);

         /*
        Crie a = 10 e b = 10 . Imprima o resultado de a == b , a != b , a > b e a >= b .
         */

        int c = 10;
        int d = 10;

        System.out.println("Comparação: " + (c == d) + " Diferença: " + (c != d) + " Maior: " +( c > d) + " Maior Igual: " + (c >= d));

         /*
        Crie idade = 20 e temCarteira = true . Imprima o resultado de idade >= 18 &&
        temCarteira .
         */

        int idade = 20;
        boolean temCarteira = true;

        System.out.println("A afirmação é verdadeira ou falsa? " + (idade >= 18 && temCarteira));

         /*
        Crie um número e imprima o resto da divisão dele por 2.
         */

        int numero = 8975985;

        System.out.println(" O resto da divisão dele por 2 é: " + (numero%2));

         /*
        Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.
         */

        double precoArroz = 5.50;

        System.out.println(" O total da compra de 3 pacotes de arroz: R$ " + (3*precoArroz));

        /*Mini-desafio
    Crie uma variável com um número qualquer e, sem usar if , imprima true ou false
    para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo?
         */

        int numeroQualquer=15;

        System.out.printf("Esse número é divisível por 3 e por 5 ao mesmo tempo? %b ",(numeroQualquer%3==0 && numeroQualquer%5==0));
    }
}
