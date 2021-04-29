package br.pucpr.poo.aula06_07;

public class Chefe extends Empregado{

    @Override
    public float calculaSalario(){
        return getSalario() * 1.4f;
    }
}
