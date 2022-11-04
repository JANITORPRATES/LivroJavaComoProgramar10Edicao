package exemplosLivro.capitulo8;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interesse
{
    public static void main(String[] args)
    {
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal taxa = BigDecimal.valueOf(0.05);

        System.out.printf("%s%20s%n", "Ano", "Valor em depósito");

        //calcula quantidade de depósito para cada um dos dez anos
        for(int ano = 1; ano <= 10; ano++)
        {
            BigDecimal valor = principal.multiply(taxa.add(BigDecimal.ONE).pow(ano));

            System.out.printf("%4d%20s%n", ano, NumberFormat.getCurrencyInstance().format(valor));
        }

    }
}
