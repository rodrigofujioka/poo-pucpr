package br.pucpr.avaliacao.conta.corrente;

public class ContaCorrente {
    private int     numero;
    private double  saldo;
    private Cliente cliente;

    //Construtor
    public ContaCorrente(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }
    public void setCliente(Cliente cliente) {
        //associa Cliente com ContaCorrente
        this.cliente = cliente;
    }
    public void depositaValor(double deposito) {
        this.saldo += deposito;
        verificaSaldo(); // Verifica saldo negativo com ASSERT
    }
    public void retiraValor(double saque) {
        this.saldo -= saque;
        verificaSaldo(); // Verifica saldo negativo com ASSERT
    }
    public double verificaSaldo() { //ASSERT saldo negativo
        assert this.saldo > 0: "Erro: Saldo negativo.";
        return this.saldo;
    }
    public void imprimeConta() { //ContaCorrente acessa dados de Cliente
        String dadosConta = "";
        dadosConta += "Numero Conta: " + this.numero + "\n";
        dadosConta += "Cliente: "      + this.cliente.getNome() + "\n";
        dadosConta += "Saldo: R$ "     + this.verificaSaldo();
        System.out.println(dadosConta+"\n");
    }
}

