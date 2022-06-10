package exemplosLivro.capitulo5;

/*
 * Nome: BreakTeste.java
 * Autor: Jânitor Prates
 * Objetivo: a instrução break sai de uma instrução for.
 * */

public class BreakTeste
{
    public static void main(String[] args)
    {
        int controle;

        for(controle = 1; controle <=10; controle++)
        {
            if (controle == 5)
                break; // termina o loop se contagem for 5

            System.out.printf("%d ", controle);
        }

        System.out.printf("%nSaiu do loop na contagem = %d%n", controle);
    }
}
