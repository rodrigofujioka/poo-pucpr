package br.pucpr.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        try{
            System.out.println("Informe o nome do Arquivo.");
            String nomeArquivo = leitor.nextLine();
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader buffer = new BufferedReader(arquivo);
            String str;
            while((str=buffer.readLine()) != null){
                System.out.println(str);
            }

        }catch (FileNotFoundException fio){
            System.out.println("Houve um problema ao acessar o arquivo.");
        } catch (IOException e) {
            System.out.println("Houve um erro inesperado.");
            e.printStackTrace();
        }


        System.out.println("Informe o valor de A: ");
        int a = lerNumero(leitor);
        System.out.println("Informe o valor de B: ");
        int b = leitor.nextInt();
        System.out.println("Resultado : " + divide(a,b));

    }

    public static int lerNumero(Scanner leitor){
        boolean nok = true;
        int valor = 0;
        while(nok){
            try{
                System.out.println("Informe um valor inteiro");
                valor = Integer.parseInt(leitor.nextLine());

                nok=false;
            }catch (InputMismatchException | NumberFormatException ip) {
                System.out.println("Informe um valor valido");
            }
        }
        return valor;
    }

    private static int divide(int a, int b){
        int z = a/b;
        return z;
    }



}
