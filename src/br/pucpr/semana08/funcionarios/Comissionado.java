package br.pucpr.semana08.funcionarios;

public class Comissionado extends Funcionario{

    private int mesesContrato;

    public Comissionado(double salarioBase, int mesesContrato){
        super(salarioBase);
        this.mesesContrato = mesesContrato;
    }

    @Override
    protected double gratificacao() {
        return mesesContrato * 10;
    }
}
