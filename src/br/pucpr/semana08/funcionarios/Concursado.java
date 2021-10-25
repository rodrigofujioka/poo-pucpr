package br.pucpr.semana08.funcionarios;

public class Concursado extends Funcionario{

    private int anosTrabalho;

    public Concursado(double salarioBase, int anosTrabalho){
        super(salarioBase);
        this.anosTrabalho = anosTrabalho;
    }

    @Override
    protected double gratificacao() {
        return anosTrabalho * 100;
    }
}
