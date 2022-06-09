package exemplosLivro.capitulo3;

/*
 * Nome: Conta3.java
 * Autor: Jânitor Prates
 * Objetivo: A classe Conta com uma variável de instância saldo do tipo double e um
 * construtor e método deposita que executa a validação.
 * */

public class Conta3
{
    private String nome;
    private double saldo;

    public Conta3(String nome, double saldo)
    {
        this.nome = nome;
        // Valida que o saldo (Variável local) é maior que 0.0; se não for, a variável de instância saldo
        //mantém seu valor inicial padrão de 0.0
        if(saldo > 0.0)
            this.saldo = saldo; // o this foi usado para informar para o compilador que o saldo que vai receber
        // o valor é o saldo variável de instância e não saldo variável local.
    }

    public void deposita(double depositaConta)
    {
        if(depositaConta > 0.0)
            saldo = saldo + depositaConta; // Aqui não foi preciso usar o this porque não tem uma variável local
        // com o mesmo nome da variável de instância portanto o compilador já sabe que se trata da variável de instância.
    }

    public double getSaldo()
    {
        return saldo;
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
