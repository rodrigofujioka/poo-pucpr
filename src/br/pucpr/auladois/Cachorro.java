package br.pucpr.auladois;

public class Cachorro {

    protected String nome;
    private int idade;

    public void late(){
        System.out.println(this.nome + " latindo au au au au");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade>=0){
            this.idade = idade;
        }
       System.out.println("Valor não é aceito, informe valores positivos");
    }
}
