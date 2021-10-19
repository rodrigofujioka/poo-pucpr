package br.pucpr.semana11;

public class Saltador extends Atleta{
    private int altura;

    public void exibir(){
        super.imprimir();
        System.out.println("Altura: " + this.altura);
    }

    public void saltar(int altura){
        this.altura = altura;
        System.out.println("Saltar : " + this.altura);
    }

    @Override
    public void action() {
        System.out.println("Ação Saltar");
    }
}
