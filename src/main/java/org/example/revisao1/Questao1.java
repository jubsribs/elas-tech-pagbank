package org.example.revisao1;
import java.util.Scanner;

public class Questao1 {
    static void main() {
        /* Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele.
        Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00.
        No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
        Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"*/


        String nomeLanche;
        double valor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do seu lanche");
        nomeLanche = sc.nextLine();

        System.out.println("Qual o valor do seu lanche?");
        valor = sc.nextDouble();

        if(valor>30.00){
            valor = valor - 5.00;
        }

        System.out.printf(
                "O lanche %s custa R$ %.2f",
                nomeLanche,
                valor
        );
    }
}
