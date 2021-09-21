package br.pucpr.semana08;

public class Corredor extends Atleta {

    private double velocidade;

    public Corredor(String nome, int numero, double velocidade) {
        super(nome, numero);
        this.velocidade = velocidade;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Velocidade: " + velocidade);
    }

    public void correr(Double velocidade){
        this.velocidade = velocidade;

    }
}
