package exemplosLivro.capitulo4;

/*
 * Nome: EstudanteTeste.java
 * Autor: Jânitor Prates
 * Objetivo: Cria e testa objetos Estudante.
 * */

public class EstudanteTeste
{
    public static void main(String[] args)
    {
        Estudante conta1 = new Estudante("Jânitor", 93.5);
        Estudante conta2 = new Estudante("José", 72.75);

        System.out.printf("A nota letra de %s é: %s%n", conta1.getNome(), conta1.getNotaLetra());
        System.out.printf("A nota letra de %s é: %s%n", conta2.getNome(), conta2.getNotaLetra());

    }
}
