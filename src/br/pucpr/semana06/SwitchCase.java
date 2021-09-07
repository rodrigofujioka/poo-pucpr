package br.pucpr.semana06;

public class SwitchCase {

    public static void main(String[] args) {

        int x = 2;

        switch (x){
            case 1 :
                System.out.println("Imprime 1");
                break;
            case 2 :
                System.out.println("Imprime 2");
                break;
            case 3 :
                System.out.println("Imprime 3");
                break;
            default:
                System.out.println("Se não entrar em nada");
        }

    }
}
