package exemplosLivro.capitulo7;

public class PassandoArray {

    public static void main(String[] args){

        int[] array = { 1, 2, 3, 4, 5 };

        System.out.printf(
                "Efeitos de passagem de array como parametro:%n" +
                "Os valores do array orignial são:%n");

        for(int valor : array)
            System.out.printf("     %d", valor);

        modificaArray(array);
        System.out.printf("%n%nOs valores do array modificado são: %n");

        //gera saída de elementos do array modificado
        for(int valor : array)
            System.out.printf("     %d", valor);

        System.out.printf("%n%nEfeitos da passagem do valor de elemento de " +
                "array[3] antes de modificaElemento(): %d%n", array[3]);

        modificaElemento(array[3]);
        System.out.printf("array[3] depois de modificaElemento: %d%n", array[3]);
    }

    public static void modificaArray(int[] array2){
        for(int i = 0; i < array2.length; i++)
            array2[i] *= 2;

    }

    public static void modificaElemento(int elemento){
        elemento *= 2;
        System.out.printf("Valor do elemento em modificaElemento: %d%n", elemento);
    }
}
