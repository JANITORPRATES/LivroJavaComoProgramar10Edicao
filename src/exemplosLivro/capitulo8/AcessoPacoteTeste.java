package exemplosLivro.capitulo8;

public class AcessoPacoteTeste {

    public static void main(String[] args) {

        AcessoPacote pacoteTeste = new AcessoPacote();

        System.out.printf("Depois da instanciação:%n%s%n", pacoteTeste);

        pacoteTeste.numero = 77;
        pacoteTeste.string = "Adeus";

        System.out.printf("%nDepois que trocou os valores: %n%s%n", pacoteTeste);
    }
}//fim da classe AcessoPacoteTeste

class AcessoPacote
{
    int numero;
    String string;

    public AcessoPacote()
    {
        numero = 0;
        string = "Olá";
    }

    public String toString()
    {
        return String.format("numero: %d; string: %s", numero, string);
    }
}

