package exemplosLivro.capitulo2;

/*
 * Nome: Comparacao.java
 * Autor: Jânitor Prates
 * Objetivo: Compara inteiros utilizando instruções if, operadores relacionais
 * e operadores de igualdade.
 * */

import java.util.Scanner;

public class Comparacao
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Entre com o primeiro número inteiro: ");
        numero1 = entrada.nextInt();

        System.out.print("Entre com o segundo número inteiro: ");
        numero2 = entrada.nextInt();

        if (numero1 == numero2)
            System.out.printf("%d = %d%n", numero1, numero2);

        if (numero1 != numero2)
            System.out.printf("%d != %d%n", numero1, numero2);

        if (numero1 < numero2)
            System.out.printf("%d < %d%n", numero1, numero2);

        if (numero1 > numero2)
            System.out.printf("%d > %d%n", numero1, numero2);

        if (numero1 <= numero2)
            System.out.printf("%d <= %d%n", numero1, numero2);

        if (numero1 >= numero2)
            System.out.printf("%d >= %d%n", numero1, numero2);
    }
}
