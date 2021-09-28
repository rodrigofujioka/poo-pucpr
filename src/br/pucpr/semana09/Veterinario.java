package br.pucpr.semana09;

import java.util.Scanner;

public class Veterinario {

    public void examinar(Mamifero mamifero){
        Scanner leitor = new Scanner(System.in);

        if(mamifero instanceof Gato){
            System.out.println("Informe o nome do Gato");
            String nome = leitor.nextLine();

            Gato gato = (Gato) mamifero;
            gato.setNome(nome);
            gato.mia();
        }

        if(mamifero instanceof Cavalo){
            Cavalo cavalo = (Cavalo) mamifero;
            cavalo.coice();
        }

        if(mamifero instanceof Cao){
            Cao cao = (Cao) mamifero;
            cao.late();
        }
    }
}
