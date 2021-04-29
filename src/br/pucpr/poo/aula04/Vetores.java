package br.pucpr.poo.aula04;

public class Vetores {

    public static void main(String[] args) {

        int[] lista = new int[3];
        lista[0] = 1;
        lista[1] = 2;
        lista[2] = 3;

        System.out.print(lista);

        Dependente[] dependentes = new Dependente[400000000];

        dependentes[0] = new Dependente("X Fujioka");
        dependentes[1] = new Dependente("Y  Fujioka");
        dependentes[2] = new Dependente("Z Fujioka");
        dependentes[3] = new Dependente("E Fujioka");

        Dependente a = new Dependente("XyZ");

        a.imprimir();
        dependentes[0].imprimir();






    }
}
