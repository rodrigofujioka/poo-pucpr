package br.pucpr.aulaum;

import br.pucpr.auladois.Cachorro;

public class UsaPessoa {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();


        Pessoa professor = null;

        professor = new Pessoa();

        professor.nome = "Rodrigo Fujioka";
        professor.idade = 38;

        professor = new Pessoa();

        professor.idade = 9;

        professor.informaNome();
        professor.informaIdade();


        professor.nome = "Helena";
        professor.informaNome();


    }

}
