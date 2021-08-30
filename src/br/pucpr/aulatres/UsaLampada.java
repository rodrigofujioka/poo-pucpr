package br.pucpr.aulatres;

public class UsaLampada {

    public static void main(String[] args) {
        Lampada lampadaJardim = new Lampada(); // instanciando
        lampadaJardim.ligar(); //usando o objeto

        lampadaJardim.desligar();



        // Todar vez que mudar o estado informar no console
        // Se a lampada estiver ligada e o usuário chamar o ligar
        // informar que a lampada esta ligada e não fazer nada.
        // mesma coisa para lampada desligada.
        if(lampadaJardim.isEstaLigada()){
            System.out.println("Lampada esta ligada");
        }else{
            System.out.println("Lampada esta desligada");
        }
    }

}
