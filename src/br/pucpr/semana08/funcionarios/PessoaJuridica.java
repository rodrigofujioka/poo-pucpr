package br.pucpr.semana08.funcionarios;

public class PessoaJuridica extends Funcionario{

    public PessoaJuridica(double salarioBase){
        super(salarioBase);
    }

    @Override
    protected double gratificacao() {
        return 0;
    }
}
