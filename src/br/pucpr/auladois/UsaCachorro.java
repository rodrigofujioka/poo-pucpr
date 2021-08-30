package br.pucpr.auladois;

public class UsaCachorro {

    public static void main(String[] args) {
        Cachorro cachorroUm = new Cachorro();
        cachorroUm.setNome("Pepitinha"); //        nome = "Pepitinha";
        cachorroUm.setIdade(-4);
        cachorroUm.late();
        cachorroUm.nome = "Rodrigo";

        Cachorro cachorroDois = new Cachorro();
        cachorroDois.setNome("Ralf ");
        cachorroUm.setIdade(3);
        cachorroDois.late();
    }

}
