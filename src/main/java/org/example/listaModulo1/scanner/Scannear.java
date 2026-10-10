package org.example.listaModulo1.scanner;

import java.util.Scanner;

public class Scannear {
    static void main(){
        /*Pergunte o nome da pessoa e responda: "Olá, [nome]!"
         */
        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.printf(" Digite seu nome: \n");
        nome = sc.nextLine();
        System.out.printf(" Olá, %s !\n",nome);

        /*Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário.
         */

        int idade;

        System.out.printf(" Digite sua idade: \n");
        idade = sc.nextInt();
        System.out.printf(" No próximo aniversário você fará %d. \n",idade+1);

        /*Pergunte dois números e mostre a soma.
         */

        int n1,n2,soma;

        System.out.printf(" Digite um número: \n");
        n1 = sc.nextInt();

        System.out.printf(" Digite outro número: \n");
        n2 = sc.nextInt();

        soma = n1+n2;

        System.out.printf(" A soma desses números é %d. \n",soma);

        /*Pergunte a altura e o peso e imprima os dois numa frase.
         */
        double altura,peso;

        System.out.printf(" Digite sua altura: \n");
        altura = sc.nextDouble();

        System.out.printf(" Digite seu peso: \n");
        peso = sc.nextDouble();

        System.out.printf(" A sua altura é %.2f e seu peso é %.2f. \n",altura,peso);

        /*🔥 Mini-desafio — Faça um programa que peça,
        nesta ordem: a idade (número), o nome (texto) e a cidade (texto).
        Depois imprima tudo numa ficha.
         */

        String nome2,cidade;
        int idade2;

        System.out.printf(" Digite sua idade: \n");
        idade2 = sc.nextInt();

        sc.nextLine();

        System.out.printf(" Digite seu nome: \n");
        nome2 = sc.nextLine();

        System.out.printf(" Digite sua cidade: \n");
        cidade = sc.nextLine();

        System.out.printf(" Sou %s , tenho %d anos e moro em %s.\n",nome2,idade2,cidade);

    }
}
