package br.pucpr.semana7;

public class Onibus extends VeiculoTerrestre{

    public Onibus(){
        System.out.println("Construtor de ônibus");
    }

    private int assentos;

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void preencheDados(){
        super.preencheDados();
    }
}
