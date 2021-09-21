package br.pucpr.semana7;

public class UsaVeiculos {

    public static void main(String[] args) {

        VeiculoTerrestre onibus = preencherVeiculo();
        int ano = onibus.getAno();

    }



    public static VeiculoTerrestre preencherVeiculo(){

        VeiculoTerrestre x = new VeiculoTerrestre();
        x.setAno(2021);
        x.setPlaca("asdasdasd");

        return x;
    }
}
