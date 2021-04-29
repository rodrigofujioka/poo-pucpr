package br.pucpr.poo.aula05;

class VeiculoTerrestre {

    private String marca;
    private String modelo;
    private int ano;
    private int kilometragem;
    private String placa;
    private String cor;
    private float valor;

    public VeiculoTerrestre(){
        System.out.println("Chamando construtor VeiculoTerrestre");
    }

    public VeiculoTerrestre(String marca, String placa){
        System.out.println("Chamando construtor VeiculoTerrestre");
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
