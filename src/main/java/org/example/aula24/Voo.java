package org.example.aula24;

import org.example.aula24.ObservadorVoo;

import java.util.ArrayList;

public class Voo {

    ArrayList<ObservadorVoo> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo o) {
        observadores.add(o);

    }

    void mudarStatus(String status) {
        for (ObservadorVoo o : observadores) {
            o.atualizar(status);
        }
    }
}