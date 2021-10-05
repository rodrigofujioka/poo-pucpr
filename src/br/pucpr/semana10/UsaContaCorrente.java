package br.pucpr.semana10;

public class UsaContaCorrente {

    public static void main(String[] args) {

        Cliente[] vetorClientes = new Cliente[5];
        ContaCorrente[] vetorContas = new ContaCorrente[5];
        int[] vetorInteiros = new int[5];
        String[] vetorString = new String[5];

        Cliente fuji = new Cliente();
        fuji.setCpf("fuji-12345678900");

        ContaCorrente conta = new ContaCorrente();
        conta.setNumero(1);

        fuji.ligar(conta);
        conta.ligar(fuji);
        conta.exibirCliente();

    }
}
