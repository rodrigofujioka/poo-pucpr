package br.pucpr.poo.aula04;

public class Arquiteto {

    private String nome;
    private int idade;

    public Arquiteto(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibaDadosPessoais(){
        System.out.println(this.nome);
        System.out.println(this.idade + " anos");
        System.out.println();
    }

    public void trabalhe(double r1, double r2, double r3){
        Circulo a = new Circulo(r1);
        double x = a.area();
        double y = a.perimetro();
        imprima(r1,x,y);

        Circulo b = new Circulo(r1);
        x = a.area();
        y = a.perimetro();
        imprima(r1,x,y);

        b = new Circulo(r3);
        x = b.area();
        y = b.perimetro();
        imprima(r3,x, y);

    }

    private void imprima(double raio, double area, double perimetro){
        System.out.print("Raio : " + raio);
        System.out.print("Area : " + area);
        System.out.print("Perimetro : " + perimetro);
    }
}
