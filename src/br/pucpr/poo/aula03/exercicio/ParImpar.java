package br.pucpr.poo.aula03.exercicio;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        for(int i=0; i<10; i++) {
            System.out.println("Informe o número");
            double valor = leitor.nextDouble();

            if ((valor % 2) == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
        }

    }
}
