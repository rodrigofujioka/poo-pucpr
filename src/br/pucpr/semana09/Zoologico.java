package br.pucpr.semana09;

public class Zoologico {

    public static void main(String[] args) {

        Cao pepita = new Cao();
        pepita.setComFome(true);
        pepita.setNome("Pepita");

        Gato felix = new Gato();
        felix.setComFome(true);
        felix.setNome("FElix");

        Cavalo apache = new Cavalo();
        apache.setComFome(true);
        apache.setNome("Apache");

        Zelador fuji = new Zelador();
        fuji.alimentar(pepita);
        fuji.alimentar(apache);
        fuji.alimentar(felix);

        Fazendeiro bruno = new Fazendeiro();
        Mamifero bicho = bruno.comprar(2);
        bicho.setNome("Tom");

        Veterinario lucas = new Veterinario();
        lucas.examinar(bicho);
        lucas.examinar(apache);
        lucas.examinar(felix);
        lucas.examinar(pepita);

    }
}
