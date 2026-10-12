package org.example.aula14.polimorfismo;

public class Pix implements MeioDePagamento{
    @Override
    public void pagar(double valor) {

        System.out.printf(" O valor pago em PIX foi %.2f\n",valor);

    }
}
