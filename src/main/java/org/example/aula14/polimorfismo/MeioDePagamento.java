package org.example.aula14.polimorfismo;

/*
    Crie a interface MeioDePagamento com pagar(double valor).
   Crie Pix e Boleto implementando ela, cada uma imprimindo uma
   mensagem diferente com printf e %.2f.

   Declare UMA variável do tipo da interface:

   MeioDePagamento forma;
   forma = new Pix();     forma.pagar(150.00);
   forma = new Boleto();  forma.pagar(150.00);
 */
public interface MeioDePagamento {
    void pagar(double valor);

}
