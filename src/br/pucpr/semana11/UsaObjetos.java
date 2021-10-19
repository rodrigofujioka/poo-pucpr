package br.pucpr.semana11;

public class UsaObjetos {

    public static void main(String[] args) {

        //Pessoa pessoa = new Pessoa();
        //Estudante estudante = new Estudante();
        //Professor professor = new Professor();

        Corredor corredor = new Corredor();
        corredor.correr(22.9);
        corredor.trocarCamisa(5);
        corredor.imprimir();
    }



}
