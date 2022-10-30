package exemplosLivro.capitulo7;

public class BaralhoDeCartasTeste {

    public static void main(String[] parametros){

        BaralhoDeCartas meuBaralhoDeCartas = new BaralhoDeCartas();
        meuBaralhoDeCartas.embaralhar();

        System.out.println();
        for(int i = 1; i <= 52; i++){
            System.out.printf("%-19s", meuBaralhoDeCartas.darAsCartas());

            if(i == 0)
                continue;

            if(i % 4 == 0)// gera uma nova linha após cada quatro cartas
                System.out.println();

        }
    }
}
