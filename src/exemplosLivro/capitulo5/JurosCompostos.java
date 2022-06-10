package exemplosLivro.capitulo5;

/*
 * Nome: JurosCompostos.java
 * Autor: Jânitor Prates
 * Objetivo: Cálculos de juros compostos com for.
 * */

public class JurosCompostos
{
    public static void main(String[] args)
    {
        double quantia;
        double principal = 1000.0;
        double taxa = 0.05;

        System.out.printf("%s%20s %n", "Ano", "Valor em deposito");

        for(int ano = 1; ano <= 10; ++ano)
        {
            quantia = principal * Math.pow(1.0 + taxa, ano);

            System.out.printf("%4d%,20.2f%n", ano, quantia);
        }
    }
}
