package br.pucpr.semana08.interfaces;

public class Lojista extends Correntista {
    private char categoria;

    public Lojista(double saldo, char categoria) {
        super(saldo);
        this.categoria = categoria;
    }

    public char categoria() {
        return categoria;
    }

    public String printDados() {
        return ("Lojista - Categoria: " + categoria + "\n" + super.printDados());
    }
}
