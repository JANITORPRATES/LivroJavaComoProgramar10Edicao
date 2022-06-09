package exemplosLivro.capitulo4;

/*
 * Nome: MediaSala.java
 * Autor: Jânitor Prates
 * Objetivo: Resolvendo o problema da média da classe usando a repetição controlada por contador.
 * */

import java.util.Scanner;

public class MediaSala
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int total = 0;
        int notaContador = 1;
        int nota = 0;

        while (notaContador <= 10)
        {
            System.out.print("Entre com a nota: ");
            nota = entrada.nextInt();
            total = total + nota;
            notaContador = notaContador + 1;
        }

        int media = total / 10;

        System.out.printf("%nTotal de 10 notas é %d%n", total);
        System.out.printf("A media da sala é %d%n", media);
    }
}
