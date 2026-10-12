package org.example.aula13;

import java.util.ArrayList;

public class Main {
    static void main(){
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();

        Animal bidu = new Cachorro();
        Animal salem= new Gato();

        bidu.emitirSom();
        salem.emitirSom();
        /*
        Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
   e percorra com for-each chamando emitirSom(). Repare que não tem nenhum if. Dica:
animais.add(new Cachorro());
         */
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        for(Animal animal : animais){
            animal.emitirSom();
        }

        /*
        Crie uma interface Notificacao com o método enviar(String mensagem).
       Crie duas classes que implementam ela: Email e SMS. Cada uma
       imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
       e percorra com for-each, enviando a mesma mensagem.

       Saída esperada:
       E-mail enviado: Sua compra foi aprovada!
       SMS enviado: Sua compra foi aprovada!
         */
        ArrayList<Notificacao> notificacao = new ArrayList<>();
        notificacao.add(new Email());
        notificacao.add(new SMS());

        for(Notificacao notificar : notificacao){
            notificar.enviar("Sua compra foi aprovada!");
        }

        /*
        Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
       Crie Carro e Moto implementando os dois. Coloque numa lista e
       percorra com for-each chamando os dois métodos em cada um.
         */

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());
        for(Veiculo transporte : veiculos){
            transporte.ligar();
            transporte.acelerar();
        }



    }
}
