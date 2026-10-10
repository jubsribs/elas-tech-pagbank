package org.example.listaModulo1.classes;

public class Classes {
    static void main(){
        /*
        Crie uma classe Pet com nome, raca e peso.
        Em outra classe, crie um objeto, preencha e imprima tudo.
         */

        Pet cachorro = new Pet();

        cachorro.nome = "Paul";
        cachorro.peso = 25.800;
        cachorro.raca = "SRD";

        System.out.printf(
                "Meu cachorro se chama %s, ele pesa %.2f kg, sua raça é %s.%n",
                cachorro.nome,
                cachorro.peso,
                cachorro.raca
        );

        /*
        Continuando, crie dois pets diferentes e imprima as duas fichas.
         */
        Pet gato = new Pet();
        Pet passaro = new Pet();

        gato.nome = "oreo";
        gato.peso = 4.500;
        gato.raca = "Persa";

        passaro.nome = "pintado";
        passaro.peso = 500;
        passaro.raca = "bem-te-vi";

        System.out.printf(
                "Meu gato se chama %s, ele pesa %.2f kg, sua raça é %s.%n",
                gato.nome,
                gato.peso,
                gato.raca
        );

        System.out.printf(
                "Meu pássaro se chama %s, ele pesa %.1f g, sua raça é %s.%n",
                passaro.nome,
                passaro.peso,
                passaro.raca
        );
        /*
        Crie uma classe Produto com nome, preco e quantidade. Imprima o valor total em estoque.
         */
        Produto produto = new Produto();

        produto.nome = "café";
        produto.preco = 3.50;
        produto.quantidade = 5;

        System.out.printf(
                "O %s custa R$ %.2f, o valor total em estoque é: R$ %.2f \n",
                produto.nome,
                produto.preco,
                produto.preco * produto.quantidade
        );

        /*
        Crie uma classe Aluna com nome, nota1, nota2 e media. Calcule a média e imprima a ficha.
         */
        Aluna aluna = new Aluna();

        aluna.nome="Ana";
        aluna.nota1 = 8.5;
        aluna.nota2 = 9.9;
        aluna.media = (aluna.nota1+ aluna.nota2)/2;

        System.out.printf(
                "A aluna %s tem notas : %.1f e %.1f, a sua média é %.1f \n",
                aluna.nome,
                aluna.nota1,
                aluna.nota2,
                aluna.media
        );

        /*
        Crie uma classe Jogadora com nome e pontos.
        Crie três jogadoras com pontuações diferentes e descubra qual tem a maior pontuação.
        Imprima o nome dela.
         */

        Jogadora j1 = new Jogadora();
        Jogadora j2 = new Jogadora();
        Jogadora j3 = new Jogadora();

        String maiorPontuacao;

        j1.nome="Ana";
        j2.nome="Bruna";
        j3.nome="Flora";

        j1.pontos = 10;
        j2.pontos = 11;
        j3.pontos = 8;

        if(j1.pontos > j2.pontos && j1.pontos > j3.pontos){
            maiorPontuacao = j1.nome;
        }
        else if(j2.pontos > j1.pontos && j2.pontos > j3.pontos){
            maiorPontuacao = j2.nome;
        }
        else{
            maiorPontuacao = j3.nome;
        }

        System.out.printf(
                "A jogadora com maior pontuação é %s. \n",
                maiorPontuacao
        );








    }
}
