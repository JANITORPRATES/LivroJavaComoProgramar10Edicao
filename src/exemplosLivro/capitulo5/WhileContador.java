package exemplosLivro.capitulo5;

/*
 * Nome: WhileContador.java
 * Autor: Jânitor Prates
 * Objetivo: Repetição controlada por contador com a instrução de repetição while.
 * */

public class WhileContador
{
    public static void main(String[] args)
    {
        int contador = 1;

        while (contador <= 10)
        {
            System.out.printf("%d ", contador);
            ++contador;
        }
        System.out.println();

        System.out.print("testando o retorno");
        System.out.print("\r");
        System.out.print("j");
    }

}
