package br.pucpr.poo.aula04;

public class Carrinho {


    private static int maximo = 10;
    private static int quantidade =0;
    private static int inseridos =0;
    private static int removidos =0;
    private static double preco_unitarios  =10.00;

    public static void inserir(){
        assert(quantidade < maximo);
        quantidade ++;
        inseridos ++;
        assert (quantidade == inseridos - removidos);
    }

    public static void remover(){
        assert(quantidade > 0);
        quantidade --;
        removidos ++;
        assert (quantidade == inseridos - removidos);
    }

    public static int quantidade(){
        return quantidade;
    }

    public static double totalizar(double preco_maximo){
        double preco_total = preco_unitarios * quantidade;
        assert (preco_total <= preco_maximo);
        return preco_total;
    }

}
