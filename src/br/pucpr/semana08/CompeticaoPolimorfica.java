package br.pucpr.semana08;

public class CompeticaoPolimorfica {


    public static void main(String[] args) {

        Atleta fuji = new Atleta("Fujioka", 45);
        Atleta lucas = new Corredor("Lucas", 43,123.7);
        Atleta igor = new Saltador("Igot", 43,3);


       lucas.imprimir();


    }
}
