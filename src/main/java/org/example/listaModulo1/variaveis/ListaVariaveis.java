package org.example.listaModulo1.variaveis;

public class ListaVariaveis {
    static void main(){
        /*Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes.
    Imprima cada uma.
         */
        String nome = "Juliana";
        int idade = 22;
        double altura = 1.71;
        System.out.printf("Meu nome é %s , tenho %d anos e tenho %.2f de altura\n",nome,idade,altura);

              /*
    Crie uma variável cidade e imprima: "Eu moro em Salvador."
         */
        String cidade = "Salvador";
        System.out.printf(" Eu moro em %s\n",cidade);
              /*
    Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.
         */
        String primeiroNome = "Juliana";
        String sobrenome = "Ribeiro";
        System.out.printf(" Meu nome completo é %s %s \n",primeiroNome,sobrenome);

              /*
    Crie uma variável preco com 29.90 e imprima o valor dela numa frase.
         */
        double preco = 29.90;
        System.out.printf(" O valor do produto é R$ %.2f \n",preco);
      /*
    Crie uma variável temCarteira com true e imprima.
         */
        boolean temCarteira = true;
        System.out.printf(" Você tem carteira de habilitação? %b \n",temCarteira);

        /*Mini-desafio
Você tem a = 10 e b = 20 . Faça a valer 20 e b valer 10, sem escrever os números
10 e 20 de novo.
         */
        int a=10;
        int b=20;
        int c=0;

        c=a;
        a=b;
        b=c;

        System.out.printf("Os novos valores de a e b, respectivamente são %d e %d \n",a,b);
    }
}
