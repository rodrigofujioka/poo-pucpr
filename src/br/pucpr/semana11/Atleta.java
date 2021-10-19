package br.pucpr.semana11;

public abstract class Atleta {

    private String nome;
    private int numero;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Número: " + this.numero);
    }

    public void trocarCamisa(int numero){
        this.numero = numero;
    }

    public abstract void action();


}
