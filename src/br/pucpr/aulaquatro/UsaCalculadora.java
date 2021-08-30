package br.pucpr.aulaquatro;

public class UsaCalculadora {

    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        int retorno = 0;

        cal.somar(4,5);
        retorno = cal.subtrair(5,6);

        System.out.println("Subtração : " + retorno);

    }
}
