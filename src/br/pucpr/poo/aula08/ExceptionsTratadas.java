package br.pucpr.poo.aula08;

public class ExceptionsTratadas {


    public static void main(String[] args) {

        try{
            String valor = null;
            int x = 0;
            int y = 10;
            int z = 20;

            z = y/x;
            char posiaovalor = valor.charAt(2);
            System.out.print(z);

        }catch (ArithmeticException e){
            System.out.print("Ocorreu uma exceção, um erro na operação");

        }catch (NullPointerException npe){
            System.out.print("Valor nulo tentou ser acessado");

        }catch (Exception ex){
            System.out.print("Erro inesperado : " + ex.getMessage());
        }



    }

}
