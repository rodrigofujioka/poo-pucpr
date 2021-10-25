package br.pucpr.semana08.interfaces;
public abstract class Correntista {
	private double saldo;
	
    public Correntista(double saldo) {
        this.saldo = saldo;
    }
    public void debitar(double valor) {
        saldo = saldo - valor;
    }
    public void depositar(double valor) {
        saldo = saldo + valor;
    }
    
    public String printDados() {
    	String retorno;
    	retorno = "Saldo = R$: " + String.format("%.2f", saldo);
    	return retorno;
    }
}
