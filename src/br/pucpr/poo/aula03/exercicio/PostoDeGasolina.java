package br.pucpr.poo.aula03.exercicio;

import java.util.Scanner;

public class PostoDeGasolina {

    public static final double VALOR_REFRI = 3.0;
    public static final double VALOR_GASOLINA = 2.5;

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a quantidade de litros");
        double listrosGasolina = leitor.nextDouble();

        System.out.println("Informe a quantidade de Refrigerantes");
        int qtdRefrigerantes = leitor.nextInt();

        double valorTotal = (listrosGasolina * VALOR_GASOLINA)
                + (qtdRefrigerantes * VALOR_REFRI);

        System.out.println("Valor Total: " + valorTotal);
    }
}
