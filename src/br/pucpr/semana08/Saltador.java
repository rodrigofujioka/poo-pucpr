package br.pucpr.semana08;

public class Saltador extends Atleta{

    private int altura;


    public Saltador(String nome, int numero, int altura) {
        super(nome, numero);
        this.altura = altura;
    }

    public void exibir(){
        imprimir();
        System.out.println("Altura: " + altura);
    }

    public void saltar(int altura){
        this.altura = altura;
    }


}
