package exemplosLivro.capitulo5;

/*
 * Nome: Soma.java
 * Autor: Jânitor Prates
 * Objetivo: Somando inteiros com a instrução for.
 * */

public class Soma
{
    public static void main(String[] args)
    {
        int total = 0;

        //total de inteiros pares de 2 a 20
        for(int numero = 2; numero <= 20; numero += 2)
            total += numero;

        System.out.printf("A soma é %d%n", total);

        total = 0;

        for (int number = 2; number <= 20; total += number, number += 2)
            ; // estrutura vazia

        System.out.printf("A soma é %d%n", total);
    }
}
