package org.example.revisao1;

import java.util.Scanner;

public class Cadastro {
    static void main(){
        /*6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."
*/
        int anoNascimento;
        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.printf(" Digite o seu Ano de Nascimento \n");
        anoNascimento = sc.nextInt();

        sc.nextLine();

        System.out.printf(" Digite o seu Nome Completo \n");
        nome = sc.nextLine();

        System.out.printf("O usuário %s nasceu em %d. %n", nome,anoNascimento);
    }
}
