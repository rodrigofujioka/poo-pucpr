package br.pucpr.arquivos;

import java.io.*;

public class SalvandoArquivo {

    public static void main(String[] args) {
        //escreverDados();
        escreverDadosTxt();
    }


    public static void lerDados(){
        FileInputStream arq;
        int letra = 0;

        try{
            arq = new FileInputStream("dados.dat");
            while(letra != -1){
                letra = arq.read();
                System.out.println(letra);
            }
            arq.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void escreverDadosTxt(){

        FileWriter out = null;
        int contaLetra = 0;
        String texto = "Texto da disciplina de Java";

        try{
            out = new FileWriter("arquivoTexto.txt");

            while(contaLetra < texto.length()){
                out.write(texto.charAt(contaLetra));
                contaLetra++;
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(out != null){
                try {
                    out.close();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }

    }






    public static void escreverDados(){

        FileOutputStream arq;
        try {
            arq = new FileOutputStream("dados.dat");
            for(int cont = 65 ; cont <90; cont++){
                arq.write(cont);
            }
            arq.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }


}
