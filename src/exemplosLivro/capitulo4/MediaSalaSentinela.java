package exemplosLivro.capitulo4;

/*
 * Nome: MediaSalaSentinela.java
 * Autor: Jânitor Prates
 * Objetivo: Resolvendo o problema da média da classe usando a repetição controlada por sentinela.
 * */

import java.util.Scanner;

public class MediaSalaSentinela
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int total = 0;
        int notaContador = 0;

        System.out.print("Entre com uma nota ou -1 para sair: ");
        int nota = entrada.nextInt();

        while (nota != -1)
        {
            total = total + nota;
            notaContador = notaContador + 1;

            System.out.print("Entre com uma nota ou -1 para sair: ");
            nota = entrada.nextInt();
        }

        if (notaContador != 0)
        {
            double media = (double) total / notaContador;

            System.out.printf("%nTotal de %d notas digitadas é %d%n", notaContador, total);
            System.out.printf("A media da sala é %.2f%n", media);
        }
        else
            System.out.println("Nenhuma nota foi digitada");
    }
}
