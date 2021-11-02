package br.pucpr.avaliacaoum;

import java.util.Scanner;

public class Cliente
{
    private String nome;
    private ContaCorrente conta;

    public Cliente(String nome, int numero) {
        this.nome = nome;
        //associa Cliente com ContaCorrente
        this.conta = new ContaCorrente(numero);
        //associa Cliente com ContaCorrente
        this.conta.setCliente (this);
    }
    public String getNome() {
        return this.nome;
    }
    public ContaCorrente getConta() {
        return this.conta;
    }

    public void opera (){
        Scanner ler = new Scanner(System.in);
        double valor;
        //Leitura do teclado
        System.out.print ("** Entre um valor de deposito: R$ ");
        valor = ler.nextDouble();
        conta.depositaValor(valor);

        System.out.print  ("** Entre um valor de saque:    R$ ");
        valor = ler.nextDouble();
        conta.retiraValor(valor);
    }
}
