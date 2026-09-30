package org.example.revisao1;

import java.util.Scanner;

public class MainAluna {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int cont =0;

        /*O que o programa faz
        Pergunta se a pessoa quer iniciar: 1 para continuar, 2 para sair
        Se escolher 1:
        pede a primeira nota
        pede a segunda nota
        calcula a média
        pede o nome da aluna
        decide se ela foi aprovada (média 6 ou mais)
        mostra uma frase com o nome, as duas notas, a média e se foi aprovada
        volta pro menu
        Se escolher 2: mostra uma mensagem de despedida e encerra
        Se digitar qualquer outra coisa: avisa que a opção é inválida e volta pro menu
        */
        while (opcao!=2){
            Aluna aluna = new Aluna();
            System.out.printf(" Quer iniciar? \n  1- para continuar \n  2 - para sair \n 3- numero de alunas cadastradas\n");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(" Digite a sua primeira nota:\n");
                    aluna.nota = sc.nextDouble();
                    if(aluna.nota>10 || aluna.nota<0){
                        System.out.println(" Nota inválida!");
                        System.out.println(" Digite a sua primeira nota:\n");
                        aluna.nota = sc.nextDouble();
                    }

                    sc.nextLine();

                    System.out.println(" Digite a sua segunda nota:\n");
                    aluna.nota2 = sc.nextDouble();
                    if(aluna.nota2>10 || aluna.nota2<0){
                        System.out.println(" Nota inválida!");
                        System.out.println(" Digite a sua segunda nota:\n");
                        aluna.nota2 = sc.nextDouble();
                    }
                    sc.nextLine();

                    aluna.media = (aluna.nota + aluna.nota2)/2;

                    System.out.println("Digite o seu nome\n");
                    aluna.nome = sc.nextLine();

                    if(aluna.media>=6){
                        aluna.passou=true;
                    }
                    else{
                        aluna.passou=false;
                    }

                    if(aluna.passou==true){
                        System.out.printf("O nome da aluna é %s.\n Sua primeira nota foi %.1f.\n Sua segunda nota foi %.1f.\n Média final foi %.1f.\n Aluna aprovada!\n"
                        ,aluna.nome,aluna.nota,aluna.nota2,aluna.media);
                    }
                    else{
                        System.out.printf("O nome da aluna é %s.\n Sua primeira nota foi %.1f.\n Sua segunda nota foi %.1f.\n Média final foi %.1f.\n Aluna Reprovada!\n"
                                ,aluna.nome,aluna.nota,aluna.nota2,aluna.media);
                    }
                    cont++;
                    break;

                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                case 3:
                    System.out.printf("O número de alunas cadastradas é %d.%n", cont);
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }
}
