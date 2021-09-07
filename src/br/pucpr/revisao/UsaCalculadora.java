package br.pucpr.revisao;

import br.pucpr.auladois.Cachorro;

public class UsaCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        calc.inicializar();
        calc.somar(6,7);

        int resultadoSubtracao = calc.subtrair(8,8);
        System.out.println("Resultado subtração : " + resultadoSubtracao);

        Cachorro cao = new Cachorro();
        cao.setNome("Fuji dog");
        cao.late();

        String nomeCachorro = cao.getNome();
    }
}
