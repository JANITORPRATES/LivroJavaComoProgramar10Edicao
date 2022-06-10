package exemplosLivro.capitulo5;

/*
 * Nome: SeguroCarroTeste.java
 * Autor: Jânitor Prates
 * Objetivo: Demonstrando Strings em um switch.
 * */

public class SeguroCarroTeste
{
    public static void main(String[] args)
    {
        SeguroCarro apolice1 = new SeguroCarro(11111111, "Toyota Corolla", "NJ");
        SeguroCarro apolice2 = new SeguroCarro(22222222, "Ford Fusion", "ME");

        apoliceEstaUfSemCulpa(apolice1);
        apoliceEstaUfSemCulpa(apolice2);
    }

    public static void apoliceEstaUfSemCulpa(SeguroCarro apolice)
    {
        System.out.println("Apolice:");
        System.out.printf("Conta #: %d; Carro: %s;%nEstado %s %s num estado \"sem culpa\"%n%n",
                apolice.getNumeroConta(), apolice.getModeloCarro(),
                apolice.getUf(), (apolice.ufSeguroSemCulpaTeste() ? "está" : "não está"));
    }
}
