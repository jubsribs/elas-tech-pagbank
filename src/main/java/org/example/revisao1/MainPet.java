package org.example.revisao1;

public class MainPet {
    static void main(){
        /*4 - Crie uma classe chamada Pet.
        Dê a ela três atributos: nome (String), raca (String) e peso (double).
        Em outra classe, instancie (crie) dois objetos diferentes dessa classe
        (por exemplo, um cachorro e um gato).
        Atribua valores para os atributos de cada um deles.
        Imprima os dados dos dois pets concatenando textos e variáveis.
         */

        Pet cachorro = new Pet();
        Pet gato = new Pet();

        cachorro.nome = "Paul";
        cachorro.peso = 25.800;
        cachorro.raca = "SRD";

        gato.nome = "oreo";
        gato.peso = 4.500;
        gato.raca = "Persa";

        System.out.printf(
                "Meu cachorro se chama %s, ele pesa %.2f kg, sua raça é %s%n.",
                cachorro.nome,
                cachorro.peso,
                cachorro.raca
        );

        System.out.printf(
                "Meu gato se chama %s, ele pesa %.2f kg, sua raça é %s%n.",
                gato.nome,
                gato.peso,
                gato.raca
        );

    }
}
