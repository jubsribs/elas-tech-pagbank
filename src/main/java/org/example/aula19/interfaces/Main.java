package org.example.aula19.interfaces;

import java.util.Scanner;

public class Main {
    static void main(){
        int opcao;
        Scanner sc = new Scanner(System.in);

        System.out.printf(" Qual banco quer utilizar ? \n 1 - MySql \n 2-MongoDB \n");
        opcao = sc.nextInt();

        BancoDeDados banco = BancoDeDadosFactory.criar(opcao);

        banco.proibidoBarulhoAposDezHoras();

        //MySql mySql = new MySql();
       // MongoDB mongoDb = new MongoDB();
       // Oracle oracle = new Oracle();
       // mongoDb.nomeUsuario = "";
       // mongoDb.pessoa = "";
        //BancoDeDados mongo = new MongoDB();

        //mySql.proibidoBarulhoAposDezHoras();
        //mySql.numero=1;

       // mySql.chamarBanco();
       // oracle.chamarBanco();

        //conectarBanco(oracle);

    }
    //public static void conectarBanco (BancoDeDados banco){

    //}

}
