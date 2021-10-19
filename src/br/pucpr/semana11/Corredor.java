package br.pucpr.semana11;

public class Corredor extends Atleta{

    private double velocidade;

    @Override
    public void imprimir(){
        System.out.println("Corredor : " + this.velocidade);
    }

    public void correr(double velocidade){
        this.velocidade = velocidade;
    }

    @Override
    public void action() {
        System.out.println("Ação Correr");
    }
}
