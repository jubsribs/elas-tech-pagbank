package org.example.aula3;

public class OperadoresRelacionais {
    static void main() {
        int a = 10;
        int b = 3;

        /*1- Crie variáveis para as notas de duas alunas.
    Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
            - a = 10, b = 3
            - a = 3, b = 10
            - a = 5, b = 5 */
        if(a==b){
            System.out.println("As notas são iguais " + a + "," + b);
        }
        if( a!=b){
            System.out.println("As notas são diferentes " + a + "," + b );
        }
        if(a>b){
            System.out.println("A primeira é maior " + a );
        }
        if(a<b){
            System.out.println("A segunda é maior " + a );
        }

            /*
            2- Exiba na tela  a == b, sendo a = 10 e b 3.
         */
        System.out.println((a==b));

        /*
            3- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo*/
        boolean chovendo = true;

        System.out.println(!chovendo);

    }
}
