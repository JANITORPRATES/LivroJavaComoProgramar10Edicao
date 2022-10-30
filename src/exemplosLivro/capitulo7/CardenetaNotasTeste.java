package exemplosLivro.capitulo7;

public class CardenetaNotasTeste
{
    public static void main(String[] args)
    {
        int[][] notasArray = { {87, 96, 70},
                               {68, 87, 90},
                                {94, 100, 90}, {100, 81, 82}, {83, 65, 85}, {78, 87, 65}, {85, 75, 83}, {91, 94, 100},
                {76, 72, 84}, {87, 93, 73}
        };

        CardenetaNotas minhaCardenetaNotas = new CardenetaNotas(
                "Introdução de Java Programação", notasArray);
        System.out.printf("Bem vindo a cardeneta de notas %n%s%n%n", minhaCardenetaNotas.getCursoNome());
        minhaCardenetaNotas.processaNotas();
    }
}
