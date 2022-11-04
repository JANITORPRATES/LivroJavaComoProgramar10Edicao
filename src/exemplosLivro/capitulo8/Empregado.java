package exemplosLivro.capitulo8;

public class Empregado
{
    private String primeiroNome;
    private String sobrenome;
    private Data dataAniversario;
    private Data dataContratacao;

    public Empregado (String primeiroNome, String sobrenome, Data dataAniversario, Data dataContratacao)
    {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.dataAniversario = dataAniversario;
        this.dataContratacao = dataContratacao;
    }

    public String toString()
    {
        return String.format("%s %s Contratação: %s Aniversário: %s", primeiroNome, sobrenome, dataContratacao, dataAniversario);
    }
}
