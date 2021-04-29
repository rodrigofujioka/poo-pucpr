package br.pucpr.poo.aula04;

public class Escritorio {


    public static void main(String[] args) {

        Arquiteto oscar = new Arquiteto("OScar Niermeyer", 104);
        Arquiteto kengo = new Arquiteto("Kengo Kuma", 64);
        desenhar(oscar, 2.0f,5.2f,3.7f);
        desenhar(kengo, 3.0f,6.2f,4.7f);

    }

    private static void desenhar(Arquiteto arq, float a, float b, float c){
        arq.exibaDadosPessoais();;
        arq.trabalhe(a,b,c);
    }
}
