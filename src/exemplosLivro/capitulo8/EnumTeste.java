package exemplosLivro.capitulo8;

import java.util.EnumSet;

public class EnumTeste
{
    public static void main(String[] args)
    {
        System.out.println("Todos os livros:");

        for (Livro livro : Livro.values())
          System.out.printf("%-10s%-45s%s%n", livro, livro.getTitulo(), livro.getAnoCopyright());

            System.out.printf("%nMostra um intervalo de constantes enum:%n");

            for (Livro livro : EnumSet.range(Livro.JHTP, Livro.CPPHTP))
                System.out.printf("%-10s%-45s%s%n", livro, livro.getTitulo(), livro.getAnoCopyright());
    }
}
