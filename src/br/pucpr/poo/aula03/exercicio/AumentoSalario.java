package br.pucpr.poo.aula03.exercicio;

import java.util.Scanner;

public class AumentoSalario {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int i = 1;


        do {
            System.out.println("Informe o salário");
            double valorSalario = leitor.nextDouble();

            if(valorSalario <500){
                System.out.println("Valor Aumento é: " + (valorSalario * 0.2));
            }

            System.out.println("Digite 0 para encerrar");
            i = leitor.nextInt();

        }while(i!=0);


    }
}
