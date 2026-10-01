package org.example.aula8;

public class Utilidades {
    /*Crie um método saudar(String nome) que imprime "Olá, [nome]! Tudo bem?".
                 Chame ele três vezes, passando nomes diferentes.*/

    static void saudar(String nome){
        System.out.printf(" Olá , %s! Tudo bem? \n",nome);
    }

    /*Crie um método dobro(int numero) que devolve o dobro do número recebido.
    No main, chame ele e mostre o resultado.
     */

    static int dobro(int numero){
        return numero*2;
    }

    /*Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas.
    No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.
     */

    static double calcularMedia(double n1, double n2){

        double media;

        media = (n1+n2)/2;

        return media;
    }

    /*Crie um método ehMaiorDeIdade(int idade) que devolve true ou false.
    No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.
     */

    static boolean ehMaiorDeIdade(int idade){
        if(idade>=18){
            return true;
        }
        return false;
    }

    /*Crie três métodos com o mesmo nome somar:
    um que recebe dois inteiros
    um que recebe três inteiros
    um que recebe dois decimais
    */

    static int somar(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    static int somar(int n1, int n2){
        return n1+n2;
    }
    static double somar(double n1, double n2){
        return n1+n2;
    }

    /*Crie dois métodos chamados saudacao:
    um sem parâmetro, que imprime "Olá!"
    um que recebe um nome, e imprime "Olá, [nome]!"
     */

    static void saudacao(){
        System.out.println(" Olá! ");
    }
    static void saudacao(String nome){
         System.out.printf(" Olá! %s" ,nome);
    }
}
