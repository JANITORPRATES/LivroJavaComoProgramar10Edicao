package exemplosLivro.capitulo8;

public class Empregado2
{
    private static int contador = 0; //número de Empregados criados
    private String primeiroNome;
    private String sobrenome;

    public Empregado2(String primeiroNome, String sobrenome)
    {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;

        ++contador; //incrementa contagem estática de empregados
        System.out.printf("Construtor de Empregado2: %s %s; contador = %d%n", primeiroNome, sobrenome, contador);
    }

    public String getPrimeiroNome()
    {
        return primeiroNome;
    }

    public String getSobrenome()
    {
        return sobrenome;
    }

    public static int getContador()
    {
        return contador;
    }

    public int getContador2()
    {
        return contador;
    }
}
