package org.example.aula24;

import org.example.aula14.polimorfismo.Estagiaria;

public class Main {
    static void main() {

        Voo california = new Voo();
        Passageiro juliana = new Passageiro();
        PainelAeroporto painel = new PainelAeroporto();

        california.adicionarObservador(juliana);

        california.mudarStatus("Embarque Iniciado");

        california.adicionarObservador(painel);
        california.mudarStatus("Atrasado");

        RegistroEstoque registro = new RegistroEstoque();
        Estoque estoque = new Estoque();

        estoque.adicionarObservador(registro);
        estoque.setQuantidade(5);
        estoque.setQuantidade(100);

    }
}
