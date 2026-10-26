package org.example.aula19.interfaces;

public class MongoDB implements BancoDeDados{
    String nomeUsuario;
    String pessoa;
    @Override
    public void proibidoBarulhoAposDezHoras() {
        System.out.println(" Barulho MongoDB");
    }

    @Override
    public void chamarBanco() {

    }

    @Override
    public void getNumero() {

    }
}
