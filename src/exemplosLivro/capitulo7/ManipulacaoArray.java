package exemplosLivro.capitulo7;

import java.util.Arrays;

public class ManipulacaoArray
{
    public static void main(String[] args)
    {
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArray: ");

        for(double valor : doubleArray)
            System.out.printf("%.1f ", valor);

        //preenche o array de 10 elementos com 7s
        int[] preencheArray = new int[10];
        Arrays.fill(preencheArray, 7);
        mostrarArray(preencheArray, "Preenche array com inteiro");

        //copia array em outro array
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        int[] intArrayCopia = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopia, 0, intArray.length);
        mostrarArray(intArray, "intArray");
        mostrarArray(intArrayCopia, "intArrayCopia");

        //verifica a igualdade de intArray e intArrayCopia
        boolean b = Arrays.equals(intArray, intArrayCopia);
        System.out.printf("%n%nintArray %s intArrayCopia%n", (b ? "==" : "!="));

        //verifica a igualdade de intArray e preencheArray
        b = Arrays.equals(intArray, preencheArray);
        System.out.printf("intArray %s preencheArray%n", (b ? "==" : "!="));

        //pesquisa o valor 5 em intArray
        int localizacao = Arrays.binarySearch(intArray, 5);

        if(localizacao >= 0)
            System.out.printf("Encontrado 5 no elemento %d posição no intArray%n", localizacao);
        else
            System.out.println("5 não foi encontrado no intArray");

        //pesquisa o valor 8763 em intArray
        localizacao = Arrays.binarySearch(intArray, 8763);

        if(localizacao >= 0)
            System.out.printf("Encontrado 8763 no elemento %d posição no intArray%n", localizacao);
        else
            System.out.println("8763 não foi encontrado no intArray");

    }

    public static void mostrarArray(int[] array, String descricao)
    {
        System.out.printf("%n%s: ", descricao);

        for(int valor : array)
            System.out.printf("%d ", valor);
    }
}
