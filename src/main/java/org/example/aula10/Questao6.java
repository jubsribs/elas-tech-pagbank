package org.example.aula10;

public class Questao6 {
 /*Crie um array com 3 nomes.
 Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe."
 Depois do try/catch, imprima "O programa continua funcionando."
  */

    static void main(){
        String [] nomes = {"juliana","claudia","flora"};
        int posicao = 5;

        try {
            System.out.printf("O nome dessa posição é: %s.\n",nomes[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe.\n");
        }
        finally {
            System.out.println("O programa continua funcionando.");
        }
    }
}
