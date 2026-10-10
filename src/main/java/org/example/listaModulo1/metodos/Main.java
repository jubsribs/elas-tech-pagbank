package org.example.listaModulo1.metodos;

public class Main {
    static void main(){
        int dobro;
        double media;
        boolean ehPar;
        Metodos.mostrarBoasVindas();

        Metodos.saudacao("Juliana");
        Metodos.saudacao("Ana");
        Metodos.saudacao("Bruna");

        dobro = Metodos.dobro(4);
        System.out.println("O dobro do número é: "+ dobro);

        media = Metodos.calcularMedia(9.8,5.3);
        System.out.printf("A média é: %.2f\n",media);

        ehPar = Metodos.ehPar(6);
        System.out.println("O número é par? : "+ ehPar);

        System.out.println("A soma dos números : "+ Metodos.somar(6,8));
        System.out.println("A soma dos números : "+ Metodos.somar(6,8,9));

        Metodos.liberarEntrada(14);




    }
}
