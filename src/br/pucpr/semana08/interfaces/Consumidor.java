package br.pucpr.semana08.interfaces;

public class Consumidor extends Correntista {
    private int pontos;

    public Consumidor(double saldo) {
        super(saldo);
        pontos = 0;
    }

    public void bonificar(int pontos) {
        this.pontos = this.pontos + pontos;
    }

    public String printDados() {
        return ("Consumidor - Pontos: " + pontos + "\n" + super.printDados());
    }
}
