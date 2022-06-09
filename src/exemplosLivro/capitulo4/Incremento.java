package exemplosLivro.capitulo4;

/*
 * Nome: Incremento.java
 * Autor: Jânitor Prates
 * Objetivo: Operadores de pré-incremento e de pós-incremento.
 * */

public class Incremento
{
    public static void main(String[] args)
    {
        int c = 5;
        System.out.printf("c antes do pós-incremento: %d%n", c);
        System.out.printf("pós-incrementando c: %d%n", c++);
        System.out.printf("c depois do pós-incremento: %d%n", c);

        System.out.println();

        c = 5;
        System.out.printf("c antes do pré-incremento: %d%n", c);
        System.out.printf("pré-incrementando c: %d%n", ++c);
        System.out.printf("c depois do pré-incremento: %d%n", c);

        int x = 2;
        int y = 3;
        int z = 0;

        //Utilize uma instrução para atribuir a soma de x e y a z, em seguida, incremente x por 1
        z = x++ + y;
        // z = (x = x + 1) + y;
        System.out.printf("O valor de z é %d%n", z);
        System.out.printf("O valor de x é %d%n", x);

        // Utilize uma instrução para decrementar a variável x por 1, então subtraia-o da variável total e armazene o resultado na variável
        //total.
        int total = 20;
        total -= --x;
    }
}
