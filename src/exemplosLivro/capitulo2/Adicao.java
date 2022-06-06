package exemplosLivro.capitulo2;

/*
 * Nome: Adicao.java
 * Autor: Jânitor Prates
 * Objetivo: Programa de adição que o usuário insere dois números, então exibe a soma deles.
 * */

import java.util.Scanner;

public class Adicao
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;

        System.out.print("Entre com o primeiro número inteiro: ");
        numero1 = entrada.nextInt();

        System.out.print("Entre com o segundo número inteiro: ");
        numero2 = entrada.nextInt();

        soma = numero1 + numero2;

        System.out.printf("O resultado da soma é %d%n",soma);
    }

}
