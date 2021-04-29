package br.pucpr.poo.aula06_07;

public abstract class Empregado {

    private float salario;

    public abstract float calculaSalario();

    public void exibeSalario(){
        System.out.println(calculaSalario());
    }

    public float getSalario() {
        return salario;
    }
}
