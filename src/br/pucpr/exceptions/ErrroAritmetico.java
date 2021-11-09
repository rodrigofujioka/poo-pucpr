package br.pucpr.exceptions;

public class ErrroAritmetico {

    public static void main(String[] args) {

        try{

            String frase = null;
            char letra = frase.charAt(6);
            System.out.println(letra);

        }catch (NullPointerException n){
            System.out.println("Você acessou um objeto vazio");

        }catch (Exception e){
            System.out.println("Ocorreu um erro inesperado");
            e.printStackTrace();

        }


       try {
           int[] lista = new int[2];
           lista[1] = 5;
           lista[2] = 10;
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Acesso de posição ilegal");
       }

       try {
           int x = 0;
           int y = 10;
           int z = y / x;
           System.out.println("Resultado " + z);
       }catch (ArithmeticException a){
           System.out.println("Divisão por zero não permitido");
       }




    }


}
