package exemplosLivro.capitulo2;

/*
 * Nome: Produto.java
 * Autor: Jânitor Prates
 * Objetivo: Calcula o produto de três inteiros.
 * */

import java.util.Scanner;

public class Produto
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int x, y, z, resultado;

        System.out.print("Entre com o primeiro número inteiro: ");
        x = entrada.nextInt();

        System.out.print("Entre com o segundo número inteiro: ");
        y = entrada.nextInt();

        System.out.print("Entre com o terceiro número inteiro: ");
        z = entrada.nextInt();

        resultado = x * y * z;

        System.out.printf("O resultado do produto dos 3 inteiros é %d%n", resultado);
    }

}
