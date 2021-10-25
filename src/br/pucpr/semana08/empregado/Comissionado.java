package br.pucpr.semana08.empregado;

import br.pucpr.semana08.comun.Empregado;

public class Comissionado extends Empregado {

    private double salarioBase = 1015.00;
    private double comissao = 1.15;
    private int quantidade;

    @Override
    public double calcularSalario(){
        salarioBase = salarioBase * (comissao * quantidade);
        return salarioBase;
    }
}
