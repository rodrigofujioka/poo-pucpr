package br.pucpr.revisao;

public class Aluno {

    private String nome;
    private String cpf;
    private long rg;

    public void imprimeNome(){
        System.out.println("Nome : " + this.getNome());
        System.out.println("CPF : " + this.getCpf());
        System.out.println("RG : " + this.getRg());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }
}
