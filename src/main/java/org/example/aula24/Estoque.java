package org.example.aula24;

import java.util.ArrayList;

public class Estoque {
    ArrayList<ObservadorEstoque> observadores = new ArrayList<>();

    void adicionarObservador(ObservadorEstoque o){
        observadores.add(o);
    }
    void setQuantidade(int quantidade){
        for (ObservadorEstoque o : observadores) {
            o.atualizar(quantidade);
        }
    }
}
