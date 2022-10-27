package extras;

/*
Retorna um array, onde o primeiro elemento é a contagem de números positivos
e o segundo elemento é a soma de números negativos. 0 não é positivo nem negativo.
 Se a entrada for uma matriz vazia ou for nula, retorne uma matriz vazia.
 */

public class Kata
{
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] array2 = countPositivesSumNegatives(array);
        System.out.println("["+ array2[0] + ", " + array2[1] + "]");

        }
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if(input != null && input.length != 0){
            int contaPositivos = 0;
            int somaNegativo = 0;

            for(int i = 0; i < input.length; i++){
                if(input[i] > 0)
                    contaPositivos++;
                else
                    somaNegativo += input[i];
            }

            return new int[] {contaPositivos, somaNegativo};
        }
        else
            return new int[] {};

    }
}
