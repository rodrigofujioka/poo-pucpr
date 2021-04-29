package br.pucpr.poo;

public class Forma {

    private int lados;

    private String cor;
    protected String nome;
    public static int valor = 10;

    public static void exibeTexto(){
        System.out.println("X");
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        if(lados>0){
            this.lados = lados;
        }else{
            System.out.println("Valor não é aceito");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
