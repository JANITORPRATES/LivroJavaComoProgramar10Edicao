package exemplosLivro.capitulo7;

public class TabuadaDois {

    public static void main(String[] paramentos){

        final int TAMANHO_ARRAY = 10;
        int[] array = new int[TAMANHO_ARRAY];

        for(int i = 0; i < array.length; i++){
            array[i] = 2 * i;
        }

        System.out.printf("%s%12s%n", "Tabuada", "Resultado");

        for(int i = 0; i < array.length; i++){
            String tabuada = "2 x " + i + " = ";
            System.out.printf("%10s%5d%n", tabuada, array[i]);

        }
    }
}
