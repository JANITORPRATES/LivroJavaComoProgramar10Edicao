package exemplosLivro.capitulo8;

public class Time1Teste
{
    public static void main(String[] args)
    {
        Time1 time = new Time1();

        mostrarTime("Depois que o objeto time foi criado ", time);
        System.out.println();

        time.setTime(13, 27, 6);
        mostrarTime("Depois que chamou setTime ", time);

        try
        {
            time.setTime(99,99,99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Exceção: %s%n%n", e.getMessage());
        }

        mostrarTime("Depois que chamou setTime com valores invalidos ", time);
    }

    private static void mostrarTime(String cabecalho, Time1 t)
    {
        System.out.printf("%s%nUniversal time: %s%nTime padrão: %s%n ", cabecalho, t.toUniversalString(),
                t.toString());
    }
}
