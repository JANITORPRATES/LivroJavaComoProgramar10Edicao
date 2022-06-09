package exemplosLivro.capitulo3;

/*
 * Nome: AdicaoDialogo.java
 * Autor: Jânitor Prates
 * Objetivo: Programa de adição que o usuário insere dois números, então exibe a soma
 * delesa a partir de um diálogo.
 * */

import javax.swing.JOptionPane;

public class AdicaoDialogo
{
    public static void main(String[] args)
    {
        int numero1, numero2, soma;

        String entrada = JOptionPane.showInputDialog("Entre com o primeiro número inteiro:");
        numero1 = Integer.parseInt(entrada);

        entrada = JOptionPane.showInputDialog("Entre com o segundo número inteiro: ");
        numero2 = Integer.parseInt(entrada);

        soma = numero1 + numero2;

        String mensagem = String.format("O resultado da soma é %d!",soma);

        JOptionPane.showMessageDialog(null, mensagem);
    }

}
