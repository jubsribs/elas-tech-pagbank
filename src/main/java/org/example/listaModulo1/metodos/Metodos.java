package org.example.listaModulo1.metodos;

public class Metodos {

   /* Crie um método mostrarBoasVindas() que imprime uma mensagem. Chame no main.*/

    static void mostrarBoasVindas(){
        System.out.println("Seja bem-vindo(a)");
    }

    /*
    Crie saudacao(String nome) que imprime "Olá, [nome]!". Chame três vezes com nomes diferentes.
     */
    static void saudacao(String nome){
        System.out.println("Olá,"+ nome+"!");
    }
    /*
    Crie dobro(int numero) que devolve o dobro. Mostre o resultado no main.
     */
    static int dobro(int dobro){
        int calculo;

        calculo = dobro*2;

        return calculo;
    }

    /*
    Crie calcularMedia(double n1, double n2) que devolve a média. Mostre com duas casas decimais.

     */

    static double calcularMedia(double n1, double n2){
        double media;

        media = (n1+n2)/2;

        return media;
    }

    /*
   Crie ehPar(int numero) que devolve true ou false. Use o retorno dentro de um if.
     */
    static boolean ehPar(int numero){
       if(numero%2==0){
           return true;
       }
           return false;
    }

    /*
    Crie dois métodos somar: um que recebe dois números e outro que recebe três.
     */

    static int somar(int n1, int n2){

        return n1+n2;
    }

    static int somar(int n1, int n2, int n3){

        return n1+n2+n3;
    }

    /*
    Crie um método ehMaiorDeIdade(int idade) que devolve true ou false.
    Depois crie outro método, liberarEntrada(int idade), que chama o primeiro e imprime se a pessoa pode entrar ou não.
    No main, chame apenas o segundo.
     */

    static boolean ehMaiorDeIdade(int idade){
        if (idade >= 18) {
            return true;
        }
        return false;
    }

    static void liberarEntrada(int idade){

        if(ehMaiorDeIdade(idade)){
            System.out.println("Entrada Liberada!");
        }
        System.out.println("Entrada não Liberada!");
    }

}
