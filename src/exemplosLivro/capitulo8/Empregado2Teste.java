package exemplosLivro.capitulo8;

public class Empregado2Teste
{
    public static void main(String[] args)
    {
        System.out.printf("Empregados antes da instanciação: %d%n", Empregado2.getContador());

        Empregado2 e1 = new Empregado2("Janitor", "Prates");
        Empregado2 e2 = new Empregado2("Palloma", "Guimaraes");

        System.out.printf("%nEmpregados depois da instanciação: %n");

        System.out.printf("via e1.getContador(): %d%n", e1.getContador());
        System.out.printf("via e1.getContador2(): %d%n", e1.getContador2());

        System.out.printf("via e2.getContador(): %d%n", e2.getContador());
        System.out.printf("via e2.getContador2(): %d%n", e2.getContador2());

        System.out.printf("Via Empregado2.getContador(): %d%n", Empregado2.getContador());

        System.out.printf("%nEmpregado 1: %s %s%nEmpregado 2: %s %s%n",
                e1.getPrimeiroNome(), e1.getSobrenome(),
                e2.getPrimeiroNome(), e2.getSobrenome());

    }
}
