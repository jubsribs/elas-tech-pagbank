package org.example.revisao1;

import java.util.Scanner;

public class MainProduto {
    static void main(){
        Produto produto = new Produto();
        Scanner sc = new Scanner(System.in);
        String nome;
        double preco;

        /*Na classe principal, faça um laço for que repita 3 vezes.
        A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
        Instancie um novo Produto e guarde nele os valores digitados.
        Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!".
        Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.
        */

        for ( int i=0; i<3 ;i++){
            System.out.printf(" Qual o nome do produto?\n");
            nome = sc.nextLine();

            System.out.printf(" Qual o preço do produto?\n");
            preco = sc.nextDouble();

            sc.nextLine();

            produto.nome = nome;
            produto.preco = preco;

            if(produto.preco>100){
                System.out.printf("Produto caro! R$%.2f\n", produto.preco);
            }
            else if(produto.preco<=100){
                System.out.printf("Produto com preço acessível! R$%.2f\n",produto.preco);
            }
        }

    }
}
