package br.pucpr.poo.aula05;

public class Automovel extends VeiculoTerrestre{

    private float motorizacao;

    public Automovel(){
        super("Marca", "123123");
        System.out.println("Chamando construtor Automovel");
    }


    public float getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(float motorizacao) {
        this.motorizacao = motorizacao;
    }
}
