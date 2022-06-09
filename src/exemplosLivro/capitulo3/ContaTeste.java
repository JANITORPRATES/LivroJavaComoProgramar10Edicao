package exemplosLivro.capitulo3;

/*
 * Nome: ContaTeste.java
 * Autor: Jânitor Prates
 * Objetivo: Cria e manipula um objeto Conta.
 * */

import java.util.Scanner;

public class ContaTeste
{
    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);

        Conta minhaConta = new Conta();

        System.out.printf("O nome inicial é: %s%n%n", minhaConta.getNome());

        System.out.println("Por favor entre com o nome:");
        String oNome = entrada.nextLine();
        minhaConta.setNome(oNome);
        System.out.println();

        System.out.printf("O nome dentro do objeto minhaConta é:%n%s%n", minhaConta.getNome());
    }
}
