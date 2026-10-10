package org.example.listaModulo1.desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio {
    static void main(){
        /*
        Um catálogo onde você cadastra os filmes que assistiu, com nota e gênero, e consegue consultar depois.
         */
        int op=0;
        int cont=0;
        double nota;
        String titulo;

        Scanner sc = new Scanner(System.in);
        Filme[] filme = new Filme[5];


        /*
        O programa mostra o menu e fica rodando até a pessoa escolher sair:

        === MEU CATÁLOGO ===
        1 - Cadastrar filme
        2 - Listar filmes
        3 - Buscar por título
        4 - Estatísticas
        5 - Sair
         */
            while (op != 5) {
                System.out.printf("=== MEU CATÁLOGO === \n" +
                        "1 - Cadastrar filme \n" +
                        "2 - Listar filmes\n" +
                        "3 - Buscar por título \n" +
                        "4 - Estatísticas \n" +
                        "5 - Sair \n" +
                        "6 - Buscar por gênero \n");

                try{
                    op = sc.nextInt();
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Só é possível digitar números!");
                    sc.nextLine();
                    op = 0;
                }

                switch (op) {
                    case 1:
                /*
                Pede título, gênero e nota. Guarda o gênero em maiúsculo.
                A classificação o programa define sozinho, a partir da nota:
                8 ou mais → Ótimo
                5 a 7.9 → Bom
                menos de 5 → Ruim
                 */
                        if (cont >= filme.length) {
                            System.out.println("Catálogo cheio! Não é possível cadastrar mais filmes.");
                            break;
                        }
                        filme[cont] = new Filme();

                        System.out.printf("Digite o Título:\n");
                        filme[cont].titulo = sc.nextLine();

                        System.out.printf("Digite o Gênero:\n");
                        filme[cont].genero = sc.nextLine().toUpperCase();

                        System.out.printf("Digite uma Nota(0 a 10):\n");
                        nota = sc.nextDouble();

                        if (nota < 0 || nota > 10) {
                            System.out.printf("A nota deve estar entre 0 e 10.\n");
                            break;
                        }
                            filme[cont].nota = nota;
                            cont++;
                            System.out.printf("Filme Cadastrado!\n");

                        break;
                    case 2:
                /*
                Mostra todos os filmes cadastrados, um por linha:
                Matrix [FICÇÃO] - Nota 9.0 - Ótimo Titanic [DRAMA] - Nota 6.5 - Bom
                 */
                        if (cont == 0) {
                            System.out.println("Nenhum filme cadastrado.");
                        } else {
                            System.out.println("\n=== FILMES CADASTRADOS ===");
                            for (int i = 0; i < cont; i++) {
                                filme[i].exibirDados();
                            }
                        }
                        break;
                    case 3:
                        if (cont == 0) {
                            System.out.println("Nenhum filme cadastrado.");
                        }
                        else {
                            System.out.printf("Digite o título: \n");
                            titulo = sc.nextLine().toUpperCase();
                            boolean encontrado = false;

                            for (int i = 0; i < cont; i++) {
                                if ((filme[i].titulo.toUpperCase()).equals(titulo)) {
                                    filme[i].exibirDados();
                                    encontrado = true;
                                }
                            }
                            if (!encontrado) {
                                System.out.printf("Filme não encontrado! \n");
                            }
                        }
                        break;
                    case 4:
                        /*
                          Mostra:
                        quantos filmes estão cadastrados
                        a média das notas, com duas casas decimais
                        o título do filme com a maior nota
                        quantos filmes são "Ótimo"
                         */
                        if (cont == 0) {
                            System.out.println("Cadastre filmes para consultar as estatísticas.");
                            break;
                        }
                        double soma = 0;
                        double media;
                        int otimos = 0;
                        Filme maiorNota = filme[0];
                        Filme menorNota = filme[0];

                        for (int i = 0; i < cont; i++) {
                            soma+= filme[i].nota;

                            if(filme[i].nota >= maiorNota.nota){
                                maiorNota = filme[i];
                            }
                            if(filme[i].nota >= 8){
                                otimos++;
                            }
                            if(filme[i].nota <= menorNota.nota){
                                menorNota = filme[i];
                            }
                        }
                        media = soma/ cont;
                        System.out.printf("Número de filmes cadastrados: %d. \n", cont);
                        System.out.printf("A média das notas: %.2f \n", media);
                        System.out.printf("O título do filme com a maior nota: %s. \n", maiorNota.titulo);
                        System.out.printf("O título do filme com a menor nota: %s. \n", menorNota.titulo);
                        System.out.printf("Quantos filmes são Ótimo ? %d. \n", otimos);
                        break;
                    case 5:
                        System.out.printf("Até Logo!\n");
                        break;
                    case 6:
                        String genero;
                        if (cont == 0) {
                            System.out.println("Nenhum filme cadastrado.");
                        }
                        else {
                            System.out.printf("Digite um gênero: \n");
                            genero = sc.nextLine().toUpperCase();
                            boolean encontrado = false;

                            for (int i = 0; i < cont; i++) {
                                if ((filme[i].genero.toUpperCase()).equals(genero)) {
                                    filme[i].exibirDados();
                                    encontrado = true;
                                }
                            }
                            if (!encontrado) {
                                System.out.printf("Gênero não encontrado! \n");
                            }
                        }
                        break;
                    default:
                        System.out.printf("Opção inválida\n");
                }
            }
    }
}
