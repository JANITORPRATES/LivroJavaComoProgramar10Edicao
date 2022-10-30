package exemplosLivro.capitulo7;

public class GraficoBarra {

    public static void main(String[] x){

        int[] array = { 2, 5, 6, 4, 10, 8, 7, 9, 4, 6, 10 };

        System.out.println("Nota distribuição:");

        for(int i = 0; i < array.length; i++){
            //gera saida do rótulo de barra (00-09: , ..., 90-99:, 100:)
            if(i == 10)
                System.out.printf("%5d: ", 100);
            else
            System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            //imprime a barra de asteriscos
            for(int asteriscos = 0; asteriscos < array[i]; asteriscos++)
                System.out.print("*");

            System.out.println();

        }
    }
}
