package br.pucpr.poo.aula06_07;

public class Animal {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }


    public void comer(){
        System.out.print("Animal Comendo");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
