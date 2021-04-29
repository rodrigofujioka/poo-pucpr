import br.pucpr.poo.Forma;

public class UsaLampada {

    public static void main(String[] args) {

        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada();

        l1.ligar();
        l1.exibeEstado();

        l2.desligar();
        l2.exibeEstado();

        l2 = l1;
        l2.desligar();

        l1.exibeEstado();

        Forma forma = new Forma();





    }
}
