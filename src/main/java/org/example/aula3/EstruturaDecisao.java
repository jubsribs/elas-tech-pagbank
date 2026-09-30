package org.example.aula3;

public class EstruturaDecisao{
    static void main() {

        //Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança",
        // de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".

        int idade=80;

        if(idade<13){
            System.out.println("Criança");
        }
        else if(idade>=13 && idade<=17){
            System.out.println("Adolescente");
        } else if (idade>=18 && idade<=59) {
            System.out.println("Adulto");
        }
        else if(idade>=60){
            System.out.println("Idoso");
        }


        // Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00).
        // Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante.
        // Se não for, mostre "Saldo insuficiente" e quanto está faltando.

        double saldo=500.00;
        double valorCompra=720.00;

        if(saldo>=valorCompra){
            System.out.println("Compra aprovada! Valor Restante R$" + (saldo-valorCompra));
        }
        else{
            System.out.println("Saldo insuficiente! Valor faltante R$" + (valorCompra-saldo));
        }

        //Crie uma variável opcao com um número de 1 a 4 e, usando switch,
        // mostre o pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá.
        // Qualquer outro número mostra "Opção inválida".

        int opcao = 4;

        switch (opcao){
            case 1:
                System.out.println("Café");
                break;
            case 2:
                System.out.println("Cappuccino");
                break;
            case 3:
                System.out.println("Chocolate Quente");
                break;
            case 4:
                System.out.println("Chá");
                break;
            default:
                System.out.println("Opção Inválida");
        }

        //Crie variáveis idade (17) e temAutorizacao (true).
        // Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização.
        // Faça o mesmo para precisa ter 18 anos e ter autorização.

        int idad = 17;
        boolean temAutorizacao = true;

        if(idad>=18 || temAutorizacao){
            System.out.println("Pode Entrar na festa!");
        }

        if(idad>=18 && temAutorizacao){
            System.out.println("Pode Entrar na festa!");
        }

        //Desafio: Crie variáveis para três notas de uma aluna.
        // Calcule a média e mostre: "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5.
        // Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.

        double nota1=5.3;
        double nota2=7.8;
        double nota3=4.5;
        double media;

        media = (nota1+nota2+nota3)/3;

        if(media >=7){
            System.out.printf("Aprovada: %.2f",media );
        }
        else if(media>=5 && media<=6.9){
            System.out.printf("Recuperação: %.2f",media );
        } else if (media<5) {
            System.out.printf("Reprovada: %.2f",media );
        }


    }
}
