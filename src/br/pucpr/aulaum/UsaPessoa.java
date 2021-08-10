package br.pucpr.aulaum;

public class UsaPessoa {

    public static void main(String[] args) {

        Pessoa professor = new Pessoa();

        professor.nome = "Rodrigo Fujioka";
        professor.idade = 38;

        professor.informaNome();
        professor.informaIdade();


        professor.nome = "Helena";
        professor.informaNome();


    }

}
