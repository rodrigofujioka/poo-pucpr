package br.pucpr.arquivos;

import java.io.Serializable;
import java.util.Scanner;

public class ManipulaObjetos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        PessoaDAO dao = new PessoaDAO();
        int opcao = 0;
        while(true){
            menu();
            opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao){
                case 1 : {
                    System.out.println("Informe o nome");
                    String nome = leitor.nextLine();
                    System.out.println("Informe o cpf");
                    String cpf = leitor.nextLine();
                    System.out.println("Informe o idade");
                    int idade = Integer.parseInt(leitor.nextLine());
                    Pessoa pessoa = new Pessoa();
                    pessoa.setCpf(cpf);
                    pessoa.setNome(nome);
                    pessoa.setIdade(idade);
                    dao.gravar(pessoa);
                    System.out.println("Pessoa salva com sucesso");
                }
                break;

                case 2 : {
                    System.out.println("Informe o CPF a ser consultado");
                    String cpf = leitor.nextLine();
                    Pessoa pessoa = dao.obterPessoa(cpf);
                    System.out.println(pessoa);
                }
                break;

                case 3 : {
                    System.out.println("Programa encerrado");
                    System.exit(0);
                }break;

            }

        }


    }

    public static void menu(){
        System.out.println("1 - Gravar Pessoa");
        System.out.println("2 - Obter Pessoa");
        System.out.println("3 - Encerrar o programa");
    }

}
