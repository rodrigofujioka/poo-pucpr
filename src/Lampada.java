public class Lampada {

    private boolean estaLigada;

    public void ligar(){
        this.estaLigada = true;
    }

    public void desligar(){
        this.estaLigada = false;
    }

    public void exibeEstado(){
        System.out.println("Lampada esta : " + this.estaLigada);
    }



}
