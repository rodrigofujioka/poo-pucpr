package br.pucpr.poo.aula08;

import java.io.*;

public class GravaArquivo {

    public static void main(String[] args) {
        BufferedReader in = null;
        PrintWriter pw = null;

        try{
            String linha = null;
             in = new BufferedReader(new FileReader("arquivo1.txt"));
             pw = new PrintWriter(new FileWriter("arquivo2.txt"));

            while((linha = in.readLine())!=null){
                pw.println(linha);
            }
            in.close();
            pw.close();
        }catch (IOException   a){
            a.printStackTrace();
        }



    }

}
