package br.pucpr.semana08.empregado;

import br.pucpr.semana08.comun.Empregado;

public class Empresa {

    public void printarSalario(Empregado empregado){
        System.out.println(empregado.calcularSalario());
    }
}
