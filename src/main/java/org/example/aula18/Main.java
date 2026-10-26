package org.example.aula18;

public class Main {
    public static void main(){
        Boneca barbie = new Boneca();
        Boneca suzy = new Boneca();
        Brinquedo brinquedo = new Brinquedo();
        Bebe aurora = new Bebe("Aurora" , "19/10/2026");


        barbie.nome = "profissões";
        barbie.corCabelo = "Preto";
        brinquedo.nome = "bola";

    barbie.tipoDeBoneca(suzy);

    brinquedo.verBrinquedo(brinquedo);
    brinquedo.soma(8,6);
    }


}
