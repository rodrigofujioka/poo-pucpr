package br.pucpr.semana10;

public class ContaCorrente {
    private int numero;

    private Cliente cliente;

    public void ligar(Cliente novoCliente){
        this.cliente = novoCliente;
    }

    public void exibirCliente(){

        if(cliente==null){
            System.out.println("Cliente não foi ligado");
        }else{
            System.out.println("Cliente Cpf: " + this.cliente.getCpf());
        }

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
