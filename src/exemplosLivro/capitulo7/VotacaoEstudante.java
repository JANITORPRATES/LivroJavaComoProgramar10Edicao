package exemplosLivro.capitulo7;

public class VotacaoEstudante {

    public static void main(String[] parametros){

        int[] notas = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequencia = new int[6];

        for(int resposta = 0; resposta < notas.length; resposta++){


            try {
                ++frequencia[notas[resposta]];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("             notas[%d] = %d%n%n", resposta,  notas[resposta]);
            }
        }

        System.out.printf("%s%12s%n", "Avaliação", "Frequência");

        for(int avaliacao = 1; avaliacao < frequencia.length; avaliacao++)
            System.out.printf("%6d%10d%n", avaliacao, frequencia[avaliacao]);
    }
}
