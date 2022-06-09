package exemplosLivro.capitulo3;

/*
 * Nome: ContaTeste3.java
 * Autor: Jânitor Prates
 * Objetivo: Entrada e saída de números de ponto flutuante com objetos Conta3.
 * */

import java.util.Scanner;

public class ContaTeste3
{
    public static void main(String[] args)
    {
        Conta3 conta1 = new Conta3("Jânitor", 50.00);
        Conta3 conta2 = new Conta3("Tadeu", -8.21);

        Scanner entrada = new Scanner(System.in);

        System.out.printf("%s saldo: R$ %.2f %n", conta1.getNome(), conta1.getSaldo());
        System.out.printf("%s saldo: R$ %.2f %n%n", conta2.getNome(), conta2.getSaldo());

        System.out.print("Entre com o valor de depósito para conta1: ");
        double valorDeposito = entrada.nextDouble();

        System.out.printf("%nAdicionando R$ %.2f ao saldo da conta1%n%n", valorDeposito);
        conta1.deposita(valorDeposito);

        //exibe os saldos
        System.out.printf("%s saldo: R$ %.2f %n", conta1.getNome(), conta1.getSaldo());
        System.out.printf("%s saldo: R$ %.2f %n%n", conta2.getNome(), conta2.getSaldo());

        System.out.print("Entre com o valor de depósito para conta2: ");
        valorDeposito = entrada.nextDouble();
        System.out.printf("%nAdicionando R$ %.2f ao saldo da conta2%n%n", valorDeposito);
        conta2.deposita(valorDeposito);

        //exibe os saldos
        System.out.printf("%s saldo: R$ %.2f %n", conta1.getNome(), conta1.getSaldo());
        System.out.printf("%s saldo: R$ %.2f %n", conta2.getNome(), conta2.getSaldo());

    }
}
