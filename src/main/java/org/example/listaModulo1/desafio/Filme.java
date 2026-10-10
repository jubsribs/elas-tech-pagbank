package org.example.listaModulo1.desafio;

public class Filme {
    /*
    Crie uma classe Filme, em arquivo separado e sem main, com:
    titulo (texto)
    genero (texto)
    nota (decimal)
    classificacao (texto)
     */
    String titulo;
    String genero;
    double nota;
    String classificacao;

    static String calcularClassificacao(double nota) {
        if (nota >= 8) {
            return "Ótimo";
        } else if (nota >= 5) {
            return "Bom";
        } else {
            return "Ruim";
        }
    }
    void exibirDados() {
        System.out.printf(
                "%s [%s] - Nota %.1f - %s%n",
                titulo, genero, nota, calcularClassificacao(nota)
        );
    }
}
