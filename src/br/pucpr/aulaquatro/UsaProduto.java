package br.pucpr.aulaquatro;

public class UsaProduto {


    public static void main(String[] args) {

        Produto xbox = new Produto("xbox", "Microsoft", 12.87f);
        Produto ps = new Produto();

        xbox.setNome("Xbox Series S");
        xbox.setPreco(12.87f);
    }


}
