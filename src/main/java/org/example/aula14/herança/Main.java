package org.example.aula14.herança;

public class Main {
    static void main(){
        /*
        Crie a classe Pessoa com os atributos nome e idade, e o método
       apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."
       Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.
       Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().
       Repare: você não escreveu nome, idade nem apresentar() na Aluna,
       e os três funcionaram.
         */
        Aluna aluna = new Aluna();

        aluna.nome = "Juliana";
        aluna.idade = 26;

        aluna.apresentar();

        /*
        Acrescente na Aluna o atributo curso e o método estudar(), que
       imprime "[nome] está estudando [curso]."
       Preencha os três atributos no objeto e chame os dois métodos.
       Repare que o estudar() usa o nome, que veio da mãe.
         */
        aluna.curso = "computação";

        aluna.estudar();

        /*
        Crie a classe Professora, também filha de Pessoa, com o atributo
       disciplina e o método lancarNota(String aluna, double nota), que
       imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
       com %.1f.
      Na Main, crie uma aluna e uma professora, preencha os atributos de
        cada objeto e chame os métodos das duas.
         */

        Professora professora = new Professora();
        professora.disciplina="Matemática";
        professora.idade = 33;
        professora.nome="Ana";

        professora.lancarNota(aluna.nome,8.9);
        professora.apresentar();

        /*
        4. Na Professora, sobrescreva o apresentar() usando @Override, pra
       imprimir "Oi, sou [nome] e ensino [disciplina]."
       Chame apresentar() na aluna e na professora e compare as saídas.
         */
        professora.apresentar();
        aluna.apresentar();

        /*
        5. Faça uma cadeia de três níveis:
           - Funcionario, com o atributo nome e o método baterPonto()
           - Gerente extends Funcionario, com aprovarFerias(String quem)
           - Diretora extends Gerente, com definirMeta(String meta)

           Na Main, crie uma Diretora, preencha o nome dela
           (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.

           Herança em cadeia: ela tem tudo que vem de cima.
         */
        Diretora diretora = new Diretora();

        diretora.nome = "Carla";

        diretora.definirMeta("Aumentar as vendas em 20%");
        diretora.aprovarFerias("Ana");
        diretora.baterPonto();

        /*

         */
        Gerente gerente = new Gerente();
        gerente.nome = "Geraldo";

        gerente.aprovarFerias("Ana");
        gerente.exportar();
        gerente.notificar("Reunião às 14h.");
        gerente.baterPonto();
    }
}
