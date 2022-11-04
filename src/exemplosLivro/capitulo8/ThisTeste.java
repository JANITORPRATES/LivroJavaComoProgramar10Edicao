package exemplosLivro.capitulo8;

public class ThisTeste
{
    public static void main(String[] args)
    {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.construirString());

    }
}//fim da classe ThisTeste

class SimpleTime
{
    private int hora;
    private int minuto;
    private int segundo;

    public SimpleTime(int hora, int minuto, int segundo)
    {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String construirString()
    {
        //utilizando o "this" explícito e implícito para chamar toUniversalString
        return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()",
                this.toUniversalString(), "toUniversalString()", toUniversalString());
    }

    public String toUniversalString()
    {
        /*
        * Não precisa usar o "this" aqui para acessar variáveis de instância,
        * porque o método não tem variáveis locais com os mesmos nomes das
        * variáveis de instância
        * */
        return String.format("%02d:%02d:%02d", this.hora, minuto, this.segundo);

    }

}
