package exemplosLivro.capitulo5;

/*
 * Nome: OperadoresLogicos.java
 * Autor: Jânitor Prates
 * Objetivo: cria a tabela-verdade dos operadores lógicos
 * */

public class OperadoresLogicos
{
    public static void main(String[] args)
    {
        // cria a tabela-verdade para o operador && (E condicional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
             "Condicional E (&&)", "false && false", (false && false),
             "false && true", (false && true),
             "true && false", (true && false),
             "true && true", (true && true));

         // cria a tabela-verdade para o operador || (OU condicional)
         System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
             "Condicional OU (||)", "false || false", (false || false),
             "false || true", (false || true),
             "true || false", (true || false),
             "true || true", (true || true));

         // cria a tabela-verdade para o operador & (E lógico booleano)
         System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
            "Lógico Booleano E (&)", "false & false", (false & false),
             "false & true", (false & true),
             "true & false", (true & false),
             "true & true", (true & true));

        // cria a tabela-verdade para o operador | (OU inclusivo lógico booleano)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
             "Lógico Booleano OU inclusivo(|)",
             "false | false", (false | false),
             "false | true", (false | true),
             "true | false", (true | false),
             "true | true", (true | true));

         // cria a tabela-verdade para o operador ^ (OU exclusivo lógico booleano)
         System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
            "Lógico Booleano OU exclusivo (^)",
             "false ^ false", (false ^ false),
             "false ^ true", (false ^ true),
             "true ^ false", (true ^ false),
             "true ^ true", (true ^ true));

         // cria a tabela-verdade para o operador ! (negação lógica)
         System.out.printf("%s%n%s: %b%n%s: %b%n", "Negação Lógica NÃO (!)",
             "!false", (!false), "!true", (!true));
    }
}
