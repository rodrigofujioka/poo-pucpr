package br.pucpr.semana09;

public class Zelador {

    public void alimentar(Mamifero mamifero){
        mamifero.setComFome(false);
        System.out.println("Animal :" + mamifero.getNome());
        System.out.println("Alimentado com sucesso ");
    }

}
