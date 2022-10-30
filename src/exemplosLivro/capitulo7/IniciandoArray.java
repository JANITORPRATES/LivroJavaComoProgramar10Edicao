package exemplosLivro.capitulo7;

public class IniciandoArray {

    public static void main(String[] parametros){

        //int[] array = new int[10];
        int[] array = { 32, 27, 58, 62, 85, 70, 96, 54, 25, 10 };

        System.out.printf("%s%8s%n", "Indice", "Valor");

        for(int i = 0; i < array.length; i++){
            System.out.printf("%5d%8d%n", i, array[i]);
        }
    }
}
