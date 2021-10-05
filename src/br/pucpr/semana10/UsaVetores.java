package br.pucpr.semana10;

import java.util.ArrayList;

public class UsaVetores {

    public static void main(String[] args) {

        Dependente novo = new Dependente("Novo");

        Dependente[] dep = new Dependente[3];
        dep[0] = new Dependente("Yumi");
        dep[1] = new Dependente("Akemi");
        dep[2] = new Dependente("Yasmin");

        ArrayList<Dependente> lista = new ArrayList<>();
        lista.add(novo);
        lista.add(dep[0]);
        lista.add(dep[1]);
        lista.add(dep[2]);








    }

}
