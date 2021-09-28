package br.pucpr.semana08;

public class Atleta {

    private String nome;
    private int numero;

    public Atleta(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Número: " + numero);
    }

    public void trocarCamisa(int numero){
        this.numero = numero;
    }
}
