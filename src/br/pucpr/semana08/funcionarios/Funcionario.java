package br.pucpr.semana08.funcionarios;

public abstract class Funcionario {

    private double salarioBase;

    public Funcionario(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double salarioMensal(){
        return salarioBase + gratificacao();
    }

    protected abstract double gratificacao();
}
