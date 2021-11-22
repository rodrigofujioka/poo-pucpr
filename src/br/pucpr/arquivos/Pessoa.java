package br.pucpr.arquivos;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;
    private String cpf;
    private int idade;

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pessoa{");
        sb.append("\nnome='").append(nome).append('\'');
        sb.append("\n, cpf='").append(cpf).append('\'');
        sb.append("\n, idade=").append(idade);
        sb.append("\n }");
        return sb.toString();
    }
}
