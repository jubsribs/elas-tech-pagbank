package org.example.listaModulo1.excecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Excecoes {
    static void main(){
        /*
        Peça dois números e mostre a divisão. Trate o caso de a pessoa digitar 0 no segundo.
         */
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite um número: ");
            n1 = sc.nextInt();

            System.out.println("Digite outro número: ");
            n2 = sc.nextInt();

            System.out.println("A divisão dos números é: " + n1/n2);
        } catch (Exception e) {
            System.out.println("Não é possível a divisão por 0.");
        }

        /*
        Crie um array com 5 notas. Peça uma posição e mostre a nota. Trate posição inválida.
         */
        Double [] notas = {8.9,9.8,5.3,6.2,4.1};
        int posicao;

        try{
            System.out.println("Digite uma posição: ");
            posicao = sc.nextInt();

            System.out.println("A nota nesta posição: " + notas[posicao]);
        } catch (Exception e) {
            System.out.println("Essa posição não existe");
        }

        /*
        Peça a idade com nextInt(). Trate o caso de a pessoa digitar texto.
         */
        int idade;

        try{
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();

            System.out.println(idade + " ótima idade!(:");
        } catch (Exception e) {
            System.out.println("Só pode é possível números.");
        }

        /*
        Crie String nome = null; e tente imprimir nome.length(). Trate a exceção.
         */

        String nome = null;

        try{
            System.out.println(nome.length());
        } catch (Exception e) {
            System.out.println("Essa variável está vazia.");
        }

        /*
        Crie um array com 3 nomes e tente imprimir a posição 5.
        Trate a exceção e, depois do try/catch, imprima "O programa continua funcionando."
         */

        String[] nomes = {"Flora","Maria","Júlia"};

        try{
            System.out.println(nomes[5]);
        } catch (Exception e) {
            System.out.println("Essa posição não existe.");
        }finally {
            System.out.println("O programa continua funcionando.");
        }

        /*
         Faça um programa com um try e três catch diferentes:
         um para divisão por zero, um para posição inválida de array e um genérico (Exception) no final.
         Teste cada situação e veja qual catch é acionado.
         */
        try{
            System.out.println(4/0);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível a divisão por 0.");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe.");
        } catch (Exception e){
            System.out.println("Erro");
        }

    }
}
