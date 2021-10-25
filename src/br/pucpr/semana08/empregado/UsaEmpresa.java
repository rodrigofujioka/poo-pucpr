package br.pucpr.semana08.empregado;

public class UsaEmpresa {

    public static void main(String[] args) {

        Chefe c = new Chefe();
        Comissionado co = new Comissionado();

        Empresa empresa = new Empresa();

        empresa.printarSalario(c);
        empresa.printarSalario(co);

    }
}
