package exemplosLivro.capitulo7;

import java.security.SecureRandom;

public class BaralhoDeCartas {

    private Carta[] baralho;
    private int cartaAtual;
    private static final int NUMERO_DE_CARTAS = 52;

    private static final SecureRandom numerosAleatorios = new SecureRandom();

    public BaralhoDeCartas(){
        String[] faces = { "As", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove",
            "Dez", "Valete", "Dama", "Rei"};
        String[] naipes = { "Copas", "Ouros", "Paus", "Espadas"};

        baralho = new Carta[NUMERO_DE_CARTAS];
        cartaAtual = 0; // a primeira carta distribuída será o baralho[0]

        //preenche baralho com objetos Carta
        for(int i = 0; i < baralho.length; i++){
            baralho[i] = new Carta(faces[i % 13], naipes[i / 13 ]);


            if(i == 0){
                System.out.print(" " + baralho[i]);
                continue;
            }


            if(i % 4 == 0){
                System.out.println();
            }

            System.out.print(" " + baralho[i]);
        }


    }//Fim construtor

    public void embaralhar(){
        //a próxima chamada de darAsCartas() deve começar com baralho[0] de novo
        cartaAtual = 0;

        //para cada Carta, seleciona outra Carta aleatrória (0-51) e troca de lugar
        for(int primeira = 0; primeira < baralho.length; primeira++){

            //seleciona um número aleatório entre 0 e 51
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);

            //troca Carta atual com Carta aleatoriamente selecionada
            Carta temporaria = baralho[primeira];
            baralho[primeira] = baralho[segunda];
            baralho[segunda] = temporaria;
        }
    }

    public Carta darAsCartas(){

        //determina se ainda tem Cartas a serem distribuídas
        if(cartaAtual < baralho.length)
            return baralho[cartaAtual++];
        else
            return null; // retorna nulo para indicar que todas as Cartas foram distribuídas
    }

}//Fim da classe
