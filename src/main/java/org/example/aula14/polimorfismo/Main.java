package org.example.aula14.polimorfismo;

import org.example.aula14.herança.Aluna;
import org.example.aula14.herança.Pessoa;

public class Main {
    static void main(){

        Calculadora calculadora = new Calculadora();

        calculadora.calcularArea(6.3);
        calculadora.calcularArea(6.3,5.9);
        calculadora.calcularArea(8);

        Painel painel = new Painel();

        painel.exibir("Juliana");
        painel.exibir(7);
        painel.exibir(9.6);
        painel.exibir(true);

        Professora professora = new Professora();

        professora.nome = "Flora";
        professora.idade = 30;
        professora.disciplina = "Java e IA";

        Aluna aluna = new Aluna();

        aluna.nome = "Juliana";
        aluna.idade = 26;
        aluna.curso = "Java e IA";

        professora.lancarNota(aluna.nome,8.9 );
        professora.apresentar();
        aluna.apresentar();
        aluna.estudar();

        Estagiaria estagiaria = new Estagiaria();

        estagiaria.nome = "Juliana";
        estagiaria.idade = 28;

        Pessoa pessoa = estagiaria;

        pessoa.apresentar();

        /*
        Crie um método na sua classe Main:
       static void mostrarFicha(Pessoa p) {
           p.apresentar();
       }
       Chame ele três vezes, passando a aluna, a professora e a estagiária.
       O método não sabe quem vai receber, e funciona pros três.
         */
        mostrarFicha(estagiaria);
        mostrarFicha(professora);
        mostrarFicha(aluna);

        MeioDePagamento pagamento;
        pagamento = new Pix();
        pagamento.pagar(150.00);
        pagamento = new Boleto();
        pagamento.pagar(150.00);

    }
    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }
}
