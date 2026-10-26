package org.example.aula19.interfaces;

public class MySql implements BancoDeDados {
    int numero;
    @Override
    public void proibidoBarulhoAposDezHoras() {
        System.out.println(" Barulho MySql ");
    }

    @Override
    public void chamarBanco() {
        System.out.println(" O banco conectado é o MySql ");
    }

    @Override
    public void getNumero() {

    }
}
