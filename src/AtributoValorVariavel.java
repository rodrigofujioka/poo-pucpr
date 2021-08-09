import java.util.Scanner;

public class AtributoValorVariavel {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o seu nome");
        String nome = leitor.nextLine();

        System.out.println("Informe a sua idade:");
        int idade = leitor.nextInt();

        System.out.println("Informe o semestre");
        float semestreAtual = leitor.nextFloat();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(semestreAtual);

    }

}

