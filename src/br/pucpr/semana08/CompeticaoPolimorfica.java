package br.pucpr.semana08;

import java.util.Scanner;

public class CompeticaoPolimorfica {


    public static void main(String[] args) {

        Atleta fuji ;
        int opcao = 0;
        Scanner leitor =  new Scanner(System.in);
        System.out.println("1 - para Corredor \n 2 - Saltador");

        if(opcao==1){
            fuji = new Corredor("Lucas", 43,123.7);
        }




        Atleta lucas = new Corredor("Lucas", 43,123.7);

        Atleta igor = new Saltador("Igot", 43,3);

       lucas.imprimir();
       //fuji.imprimir();
       igor.imprimir();


    }
}
