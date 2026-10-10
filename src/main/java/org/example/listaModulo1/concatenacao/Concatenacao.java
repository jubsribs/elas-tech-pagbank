package org.example.listaModulo1.concatenacao;

public class Concatenacao {
    static void main(){
        /* Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."
         */
        String nome = "Ana";
        int idade = 28;

        System.out.println(nome + " tem " + idade + " anos.");

        /* Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.
         */
        double nota1 = 8.0;
        double nota2 = 7.0;
        double media;

        media = (nota1+nota2)/2;

        System.out.printf(" A sua média é %.2f \n",media);

        /* Crie uma variável com o preço de um produto e imprima com duas casas decimais.
         */
        double preco= 18.96;

        System.out.printf(" O preço do produto é : R$ %.2f \n",preco);

        /* Usando printf, imprima numa linha só o nome, a idade e a altura.
         */

        String nomeSegundo = "Juliana";
        int idadeSegundo = 26;
        double altura = 1.71;

        System.out.printf(" Meu nome é %s, tenho %d anos e %.2f de altura. \n",nomeSegundo,idadeSegundo,altura);

        /*🔥 Mini-desafio — Crie variáveis para três produtos (nome e preço) e imprima um recibo.
        Cada linha deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.
        💡 Crie uma variável total começando em zero, antes dos produtos, e vá somando cada preço nela.
         */

        String produto1 = "Arroz";
        String produto2 = "Feijão";
        String produto3 = "Macarrão";
        double preco1 = 5.80;
        double preco2 = 7.60;
        double preco3 = 2.35 ;
        double total =0;

        total = preco1+preco2+preco3;

        System.out.printf("  O produto %s custa R$ %.2f\n" +
                " O produto %s custa R$ %.2f\n" +
                "O produto %s custa R$ %.2f\n" +
                "O total da compra é : R$ %.2f"
                ,produto1,preco1,produto2,preco2,produto3,preco3,total);



    }
}
