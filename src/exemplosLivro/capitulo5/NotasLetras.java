package exemplosLivro.capitulo5;

/*
 * Nome: NotasLetras.java
 * Autor: Jânitor Prates
 * Objetivo: A classe NotasLetras utiliza a instrução switch para contar as letras das notas escolares.
 * */

import java.util.Scanner;

public class NotasLetras
{
    public static void main(String[] args)
    {
        int total = 0;
        int contadorNotas = 0;
        int aContador = 0;
        int bContador = 0;
        int cContador = 0;
        int dContador = 0;
        int fContador = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.printf("%s%n%s%n  %s%n  %s%n", "Digite as notas inteiras no intervalo de 0 a 100.",
                "Digite o indicador de fim de arquivo para encerrar a entrada:",
                "No UNIX/Linux/Mac OS X digite <Ctrl> d e pressione Enter",
                "No Windows digite <Ctrl> z e pressione Enter");

        //faz loop até o usuário inserir o indicador de fim do arquivo
        while (entrada.hasNext())
        {
            int nota = entrada.nextInt();
            total += nota;
            ++contadorNotas;

            switch (nota / 10)
            {
                case 9:
                case 10:
                    ++aContador;
                    break;

                case 8:
                    ++bContador;
                    break;

                case 7:
                    ++cContador;
                    break;

                case 6:
                    ++dContador;
                    break;

                default:
                    ++fContador;
                    break;
            }//fim do switch
        } // fim do while

        System.out.printf("%nRelatório da nota:%n");

        //se usuário inseriu pelo menos uma nota...
        if(contadorNotas != 0)
        {
            double media = (double) total / contadorNotas;

            System.out.printf("Total de %d notas digitadas é %d%n", contadorNotas, total);
            System.out.printf("A media da sala é %.2f%n", media);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Número de alunos que receberam cada nota:",
                    "A: ", aContador,
                    "B: ", bContador,
                    "C: ", cContador,
                    "D: ", dContador,
                    "F: ", fContador);
        }
        else
            System.out.println("Nenhuma nota foi inserida");
    }
}
