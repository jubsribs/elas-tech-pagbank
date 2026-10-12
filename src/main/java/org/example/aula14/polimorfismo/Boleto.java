package org.example.aula14.polimorfismo;

public class Boleto implements MeioDePagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf(" O valor pago em BOLETO foi %.2f\n",valor);
    }
}
