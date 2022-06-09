package exemplosLivro.capitulo4;

/*
 * Nome: Calculadora.java
 * Autor: Jânitor Prates
 * Objetivo: Calcula a soma dos inteiros de 1 a 10
 * */

public class Calculadora
{
    public static void main(String[] args)
    {
        int soma = 0;
        int x = 1;

        while (x <= 10)
        {
            soma += x;
            ++x;
        }

        System.out.printf("A soma é: %d%n", soma);
    }

}
