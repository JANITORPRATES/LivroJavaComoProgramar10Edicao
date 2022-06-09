package exemplosLivro.capitulo3;

/*
 * Nome: ContaTeste2.java
 * Autor: Jânitor Prates
 * Objetivo: Usando o construtor de Conta2 para inicializar a variável de instância nome
 * no momento em que cada objeto Conta2 é criado.
 * */

public class ContaTeste2
{
    public static void main(String[] args)
    {
        Conta2 minhaConta1 = new Conta2("Jânitor");
        Conta2 minhaConta2 = new Conta2("Palloma");

        System.out.printf("O nome da minhaConta1 é: %s%n", minhaConta1.getNome());

        System.out.printf("O nome da minhaConta2 é: %s%n", minhaConta2.getNome());
    }

}
