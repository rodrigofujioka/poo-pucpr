package br.pucpr.revisao;

public class Principal {

    public static void main(String[] args) {

        Aluno carolina = new Aluno();
        Aluno lucas = new Aluno();
        Aluno aluno = new Aluno();

        carolina.setNome("Carolina");
        carolina.setCpf("123123");
        carolina.setRg(123123);

        carolina.imprimeNome();
        lucas.imprimeNome();
        aluno.imprimeNome();


    }

}
