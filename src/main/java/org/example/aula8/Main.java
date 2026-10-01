package org.example.aula8;

import java.util.Scanner;

public class Main {
    static void main(){

      String [] nome = {"juliana", "claudia", "flora"};
      int numero = 5;
      Scanner sc = new Scanner(System.in);
      double n1,n2;
      int idade;
      boolean ehMaior;

      for(int i=0; i<3; i++){
          Utilidades.saudar(nome[i]);
      }

      System.out.println(Utilidades.dobro(numero));

        System.out.println(" Digite a primeira nota: \n");
        n1 = sc.nextDouble();

        System.out.println(" Digite a segunda nota: \n");
        n2 = sc.nextDouble();

        System.out.printf(" Sua média é: %.2f \n",Utilidades.calcularMedia(n1,n2));

        System.out.println(" Digite a sua idade: \n");
        idade = sc.nextInt();

        ehMaior=Utilidades.ehMaiorDeIdade(idade);
        if(ehMaior){
            System.out.println("Você é maior de idade!");
        }
        else{
            System.out.println("Você é não maior de idade!");
        }

        System.out.printf("Soma de dois inteiros: %d\n",Utilidades.somar(8,5));
        System.out.printf("Soma de três inteiros: %d\n",Utilidades.somar(10,20,30));
        System.out.printf("Soma de dois decimais: %.2f \n",Utilidades.somar(10.5, 20.5));

        Utilidades.saudacao("juliana");
    }
}
