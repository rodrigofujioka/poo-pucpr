package br.pucpr.auladois;

import java.util.Scanner;

public class ExercicioSoma {


    public static void main(String[] args) {
        int valorA ;
        int valorB ;
        int soma ;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor A");
        valorA = leitor.nextInt();

        System.out.println("Informe o valor B");
        valorB = leitor.nextInt();

        soma = valorA + valorB;

        System.out.println("O Valor da soma é : " + soma);
    }

}
