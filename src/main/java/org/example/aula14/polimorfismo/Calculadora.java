package org.example.aula14.polimorfismo;

/* Crie a classe Calculadora com TRÊS métodos chamados calcularArea():
   - recebe um double (lado do quadrado)  -> lado * lado
   - recebe dois double (base e altura)   -> base * altura
   - recebe um int (raio do círculo)      -> 3.14159 * raio * raio

 */
public class Calculadora {

    Double calcularArea(double lado){

        return lado*lado;
    }

    Double calcularArea(double base,double altura){

        return base*altura;

    }
   Double calcularArea(int raio){

        return 3.14159 * raio * raio;

    }
}

