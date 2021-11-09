package br.pucpr.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeitorArquivo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o nome do arquivo ");
        String nomeArquivo = leitor.nextLine();

        try {
            lerArquivo(nomeArquivo);
        }catch (FileNotFoundException fn) {
            System.out.println("O Arquivo informado não foi encontrado : " + nomeArquivo);
        }catch (IOException e) {
            System.out.println("Ocorreu um problema ao acessar o arquivo");
        } catch (FujiokaNotFoundException e) {
            System.out.println("Arquivo do Fujioka, não pode ser lido");
        }
    }

    public static void lerArquivo(String nomeArquivo) throws IOException, FujiokaNotFoundException {
        if(nomeArquivo.equalsIgnoreCase("fujioka.txt")){
            throw new FujiokaNotFoundException("Erro, arquivo negado");
        }
        FileReader arquivo = new FileReader(nomeArquivo);
        BufferedReader buffer = new BufferedReader(arquivo);
        String str;
        while((str=buffer.readLine()) != null){
            System.out.println(str);
        }
    }

}
