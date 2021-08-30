package br.pucpr.aulatres;

public class Lampada {

    private boolean estaLigada = false;

    public void ligar(){

        if(this.isEstaLigada()){
            System.out.println("A Lampada já se encontra ligada, operação não realizada");
        }else{
            System.out.println("A lampada esta sendo ligada");
            setEstaLigada(true);
            System.out.println("Lampada ligada com sucesso");
        }

    }

    public void desligar(){
        this.estaLigada = false;
    }

    public boolean isEstaLigada() {
        return estaLigada;
    }

    public void setEstaLigada(boolean estaLigada) {
        this.estaLigada = estaLigada;
    }
}
