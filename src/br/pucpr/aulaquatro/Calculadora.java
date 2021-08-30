package br.pucpr.aulaquatro;

public class Calculadora {

    public void somar(int valorA, int valorB){
        int soma = valorA + valorB;
        System.out.println("Soma: " + soma);
    }

    public int subtrair(int valorA, int valorB){
        int subtracao = valorA - valorB;
        return subtracao;
    }

}
