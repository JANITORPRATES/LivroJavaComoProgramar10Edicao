package exemplosLivro.capitulo5;

/*
 * Nome: SeguroCarro.java
 * Autor: Jânitor Prates
 * Objetivo: Classe que representa uma apólice de seguro de automóvel.
 * */

public class SeguroCarro
{
    private int numeroConta;
    private String modeloCarro;
    private String uf;

    public SeguroCarro(int numeroConta, String modeloCarro, String uf)
    {
        this.numeroConta = numeroConta;
        this.modeloCarro = modeloCarro;
        this.uf = uf;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public boolean ufSeguroSemCulpaTeste()
    {
        boolean ufSemCulpa;

        //determina se o estado tem seguros de automóvel "sem culpa"
        switch (getUf())
        {
            case "MA": case "NJ": case "NY": case "PA":
                ufSemCulpa = true;
                break;
            default:
                ufSemCulpa = false;
                break;
        }

        return ufSemCulpa;
    }
}
