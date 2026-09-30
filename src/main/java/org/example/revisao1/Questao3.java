package org.example.revisao1;

import java.util.Scanner;

public class Questao3 {
    static void main() {
        /*3 - Usando um do-while e um switch, crie um menu interativo.
        O menu deve oferecer três opções:
        1 - Ver camisas
        2 - Ver calças
        3 - Sair
        Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha.
        Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3*/

        int opcao=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.printf("Menu: \n");
            System.out.printf("1 - Ver camisas \n");
            System.out.printf("2 - Ver calças \n");
            System.out.printf("3 - Sair \n");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.printf("Você escolheu ver camisas!\n");
                    break;

                case 2:
                    System.out.printf("Você escolheu ver calças!\n");
                    break;

                default:
                    System.out.printf("Opção Inválida!\n");
            }

        }while(opcao!=3);
    }
}
