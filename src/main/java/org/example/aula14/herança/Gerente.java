package org.example.aula14.herança;

public class Gerente extends Funcionario implements Notificavel,Exportavel{

    void aprovarFerias(String quem){
        System.out.println(nome + " aprovou as férias de " + quem + ".");
    }

    @Override
    public void exportar() {
        System.out.println("Dados do gerente " + nome + " exportados.");
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificação para " + nome + ": " + mensagem);
    }
}
