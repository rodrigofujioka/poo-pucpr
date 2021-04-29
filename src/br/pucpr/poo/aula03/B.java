package br.pucpr.poo.aula03;

public class B {

    static void f(){
        A.g();
        int x = A.k;

        A.k =10;
    }

    public static void main(String[] args) {
        f();
    }
}
