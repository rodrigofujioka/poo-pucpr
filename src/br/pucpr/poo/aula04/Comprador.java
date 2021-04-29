package br.pucpr.poo.aula04;

public class Comprador {

    public static void main(String[] args) {


        int max_insercao = 10;
        int max_remocao = 4;
        double max_preco = 80.00;

        for (int i = 0; i < max_insercao; i++)
            Carrinho.inserir();
            System.out.println(Carrinho.quantidade());


            for (int i = 0; i < max_remocao; i++)
                Carrinho.remover();
            System.out.println(Carrinho.quantidade());
            System.out.println(Carrinho.totalizar(max_preco));

        }
    }

