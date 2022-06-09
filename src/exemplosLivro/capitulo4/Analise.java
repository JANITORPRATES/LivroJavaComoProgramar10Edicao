package exemplosLivro.capitulo4;

/*
 * Nome: Analise.java
 * Autor: Jânitor Prates
 * Objetivo: Análise dos resultados do exame utilizando instruções de controle aninhadas.
 * */

import java.util.Scanner;

public class Analise
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int aprovados = 0;
        int reprovados = 0;
        int contadorEstudante = 1;
        int resultado;

        while (contadorEstudante <= 10)
        {
            System.out.print("Entre com o resultado (1 = aprovado, 2 = reprovado): ");
            resultado = entrada.nextInt();

            //if...else está aninhado na instrução while
            if (resultado == 1)
                aprovados = aprovados + 1;
            else
                reprovados = reprovados + 1;

            contadorEstudante = contadorEstudante + 1;
        }

        System.out.printf("Aprovados: %d%nReprovados: %d%n", aprovados, reprovados);

        if (aprovados > 8)
            System.out.println("Bonus para o instrutor!");

    }
}
