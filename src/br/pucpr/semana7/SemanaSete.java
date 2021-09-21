package br.pucpr.semana7;

public class SemanaSete {

    public static void main(String[] args) {

        int[] valores = {1,4,5};

        for(int x =0; x < 3; x++){
            System.out.println("Valor vetor : " +valores[x]);

            if(x==0){
                continue;
            }
            System.out.println("Valor x : " + x);
            break;
        }
    }

}
