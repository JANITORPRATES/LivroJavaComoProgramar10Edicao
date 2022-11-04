package exemplosLivro.capitulo8;

public class EmpregadoTeste
{
    public static void main(String[] args)
    {
        Data aniversario = new Data(24, 7, 1949);
        Data contratacao = new Data(12, 3, 1988);
        Empregado empregado = new Empregado("Jânitor", "Prates", aniversario, contratacao);

        System.out.println(empregado);
    }
}
