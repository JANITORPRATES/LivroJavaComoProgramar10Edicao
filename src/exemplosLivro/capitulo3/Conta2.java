package exemplosLivro.capitulo3;

/*
 * Nome: Conta2.java
 * Autor: Jânitor Prates
 * Objetivo: A classe Conta com um construtor que inicializa o nome.
 * */

public class Conta2
{
    private String nome;

    public Conta2(String nome)
    {
        this.nome = nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }
}
