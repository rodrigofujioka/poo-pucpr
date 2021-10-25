package br.pucpr.semana08.empregado;

import br.pucpr.semana08.comun.Empregado;

public class Chefe extends Empregado {

    private double salarioMensal;

    @Override
    public double calcularSalario(){
        salarioMensal = 20000.00 * 1.2;
        return salarioMensal;
    }

}
