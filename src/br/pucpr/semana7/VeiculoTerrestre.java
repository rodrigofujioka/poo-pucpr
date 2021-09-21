package br.pucpr.semana7;

import java.util.Scanner;

class VeiculoTerrestre {

    private String marca;
    private String modelo;
    private int ano;
    private int kilometragem;
    private String placa;
    private String cor;
    private float valor;
    private String renavan;

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
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

    public void preencheDados(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a Marca");
        this.setPlaca(leitor.nextLine());
        System.out.println("Informe o Modelo");
        this.setPlaca(leitor.nextLine());

    }
}
