package br.pucpr.avaliacao.conta.corrente;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

    private String nome;
    //Coleção de objetos
    private ArrayList<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        // Coleção de objetos - inicializa ArrayList
        this.clientes   = new ArrayList<Cliente> ();
    }
    public void addCliente(Cliente c) {
        //Coleção de objetos - adiciona obj no ArrayList
        clientes.add(c);
    }


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int opcao = 5;
        Banco banco = new Banco("Banco Fuji SA.");

        while(true){
            menuPrincipal();
            opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao){
                case 1 : {
                    String nome;
                    int numeroConta;
                    System.out.println("Informe o nome ");
                    nome = leitor.nextLine();
                    System.out.println("Informe o número conta ");
                    numeroConta = Integer.parseInt(leitor.nextLine());
                    Cliente cliente = new Cliente(nome, numeroConta);
                    banco.addCliente(cliente);
                    break;
                }
                case 2 : {
                    System.out.println("Informe a conta Corrente");
                    int conta = Integer.parseInt(leitor.nextLine());
                    Cliente clienteAchado = null;
                    for(Cliente clienteBusca : banco.clientes){
                        if(clienteBusca.getConta().getNumero() == conta){
                            clienteAchado = clienteBusca;
                            break;
                        }
                    }
                    if(clienteAchado!=null){
                        clienteAchado.getConta().imprimeConta();
                    }else{
                        System.out.println("Conta Corrente não encontrada para " + conta);
                    }

                    break;
                }
                case 5 : {
                    System.out.println("Programa Encerrado");
                    System.exit(0);
                }
                default:{
                    System.out.println("Opção não existe");
                }
            }

        }


    }

    public static void menuPrincipal(){
        System.out.println("Menu de Opções :");
        System.out.println("1 : Cadastrar Cliente");
        System.out.println("2 : Consultar Cliente");
        System.out.println("3 : Sacar ");
        System.out.println("4 : Depositar ");
        System.out.println("5 : Sair ");
    }


}

