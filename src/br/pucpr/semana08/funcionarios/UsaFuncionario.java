package br.pucpr.semana08.funcionarios;

public class UsaFuncionario {

    public static void main(String[] args) {

        Concursado joao = new Concursado(1000.00, 10);
        Comissionado jose  = new Comissionado(1000.00, 10);
        PessoaJuridica fujioka = new PessoaJuridica(1000.00);

        System.out.println("Salário do João = R$:  " + joao.salarioMensal() );
        System.out.println("Salário do Jose = R$:  " + jose.salarioMensal() );
        System.out.println("Salário do Jose = R$:  " + fujioka.salarioMensal() );


    }

}
