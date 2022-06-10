package exemplosLivro.capitulo5;

/*
 * Nome: ContinueTeste.java
 * Autor: Jânitor Prates
 * Objetivo: Instrução continue que termina uma iteração de uma instrução for.
 * */

public class ContinueTeste
{
    public static void main(String[] args)
    {
        for(int controle = 1; controle <= 10; controle++)
        {
            if (controle == 5)
                continue; // pula o código restante no corpo do loop se contagem for 5

            System.out.printf("%d ", controle);
        }

        System.out.printf("%n\"Continue\" foi usado para pular a impressão do número 5");
    }
}
