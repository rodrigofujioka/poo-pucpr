package br.pucpr.poo.aula06_07;

public class UsaAnimal {


    public static void main(String[] args) {

        Animal  a = new Animal("Leão");
        a.comer();

        a = new Jacare("Jacaré");
        a.comer();

        alimentar(new Jacare("Jacaré"));
        alimentar(new Tigre("Tigre"));
        alimentar(new Animal("Dinossauro"));

    }

    public static void alimentar(Animal a){

        if(a instanceof Jacare){
            System.out.print("Jacaré");
        }

        if(a instanceof Tigre){

        }

        a.comer();

    }
}
