package br.pucpr.revisao;

public class Calculadora {

    public void inicializar(){
        System.out.println("Iniciando Calculadora");
    }

    public void somar(int valorA, int valorB){
        int soma = valorA + valorB;
        System.out.println("Soma : " + soma);
    }

    public int subtrair(int valorA, int valorB){
        int subtracao = valorA - valorB;
       return subtracao;
    }

}
