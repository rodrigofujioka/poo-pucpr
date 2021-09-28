package br.pucpr.semana09;

public class Fazendeiro {

    public Mamifero comprar(int tipo){
        Mamifero mamifero;
        switch (tipo){
            case 1 : mamifero = new Cao(); break;
            case 2 : mamifero = new Gato(); break;
            default: mamifero = new Cavalo();
        }
        return mamifero;
    }

}
