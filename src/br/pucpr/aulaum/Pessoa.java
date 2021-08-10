package br.pucpr.aulaum;

public class Pessoa {

    String nome;
    int idade;
    String cpf;

    public void informaNome(){
        System.out.println("Nome: " + this.nome);

    }

    public void informaIdade(){
        System.out.println("Idade: " + this.idade);
    }
}
