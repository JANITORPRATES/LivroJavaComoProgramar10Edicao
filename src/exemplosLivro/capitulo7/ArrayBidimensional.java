package exemplosLivro.capitulo7;

public class ArrayBidimensional {

    public static void main(String[] args){

        int [][] array1 = { {1, 2, 3}, {4, 5, 6}};
        int [][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Valores de array1 por linha são");
        saidaArray(array1); //exibe array1 por linha

        System.out.printf("%nValores de array2 por linha são%n");
        saidaArray(array2);

    }

    public static void saidaArray(int[][] array){
        //faz um loop pelas linhas do array
        for(int linha = 0; linha < array.length; linha++){

            //faz um loop pelas colunas da linha atual
            for(int coluna = 0; coluna < array[linha].length; coluna++)
                System.out.printf("%d  ", array[linha][coluna]);

            System.out.println();
        }

    }
}
