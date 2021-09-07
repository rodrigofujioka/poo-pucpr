package br.pucpr.semana06;

import java.util.Scanner;

public class ExemploRepeticao {


    public static void main(String[] args) {

        String opcao = "não";
        boolean continuaLaco = true;
        Scanner leitor = new Scanner(System.in);

        do{
            System.out.println("Deseja encerra o programa");
            System.out.println("1 - Para encerrar o programa");
            System.out.println("2 - Para printar o seu nome");
            opcao = leitor.nextLine();

            switch (opcao){

                case "1" : continuaLaco = false;
                break;

                case "2" : System.out.println("Printando nome do usuário");
                break;

                default:
                    System.out.println("Opção não é valida");

            }

        }while (continuaLaco);





    }
}
