package exemplosLivro.capitulo7;

public class SomaArray {

    public static void main(String[] parametros){

        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        for(int i = 0; i < array.length; i++ ){
            total += array[i];
        }

        System.out.printf("O valor da soma total dos elementos do array é %d ", total);
    }
}
