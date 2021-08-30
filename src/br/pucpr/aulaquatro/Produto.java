package br.pucpr.aulaquatro;

public class Produto {

    private String nome;
    private String marca;
    private float preco;

    public Produto(String nome, String marca, float preco){
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public Produto(){
        System.out.println("Construtor default");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
