package exemplosLivro.capitulo6;

import java.security.SecureRandom;

// A classe Craps simula o jogo de dados craps.
public class Craps {

    private static final SecureRandom numerosAleatorios = new SecureRandom();

    private enum Status {CONTINUA, GANHOU, PERDEU};

    final static private int DOIS = 2;
    private static final int TRES = 3;
    private static final int SETE = 7;
    private static final int ONZE = 11;
    private static final int DOZE = 12;

    public static void main(String[] parametros){

        int minhaPontuacao = 0;
        Status statusJogo;

        int somaDados = jogaDado();

        switch(somaDados){
            case SETE:
            case ONZE:
                statusJogo = Status.GANHOU;
                break;
            case DOIS:
            case TRES:
            case DOZE:
                statusJogo = Status.PERDEU;
                break;
            default:
                statusJogo = Status.CONTINUA;
                minhaPontuacao = somaDados;
                System.out.printf("Sua pontuação é %d%n",minhaPontuacao);
                break;
        }

        while (statusJogo == Status.CONTINUA){
            somaDados = jogaDado();

            if(somaDados == minhaPontuacao)
                statusJogo = Status.GANHOU;
            else
                if (somaDados == SETE)
                statusJogo = Status.PERDEU;
        }

        if(statusJogo == Status.GANHOU)
            System.out.println("Jogador GANHOU!!!");
        else
            System.out.println("Jogador PERDEU!");

    }

    public static int jogaDado(){

        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6);

        int soma = dado1 + dado2;

        System.out.printf("Jogador tirou %d + %d = %d%n", dado1, dado2, soma);
        return soma;
    }

}
