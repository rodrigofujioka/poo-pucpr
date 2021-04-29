package br.pucpr.poo.aula03.exercicio;

import javax.swing.*;
import java.util.Scanner;

public class CalculaSalario {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o salário");
        double valorSalario = leitor.nextDouble();

        System.out.println("Informe o percentual de aumento em % 0 - 100");
        double percentualAumento = leitor.nextDouble();

        double valorAumento = valorSalario * (percentualAumento/100);

        System.out.println("Valor Aumento : " + valorAumento);
        System.out.println("Novo Salário : " + (valorAumento + valorSalario));

    }

}
