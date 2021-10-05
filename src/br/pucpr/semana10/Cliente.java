package br.pucpr.semana10;

public class Cliente {

    private String cpf;
    private ContaCorrente conta;

    public void ligar(ContaCorrente novaConta){
        this.conta = novaConta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
