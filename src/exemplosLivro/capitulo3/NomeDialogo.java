package exemplosLivro.capitulo3;

/*
 * Nome: NomeDialogo.java
 * Autor: Jânitor Prates
 * Objetivo: Obtendo a entrada de usuário a partir de um diálogo
 * */

import javax.swing.JOptionPane;

public class NomeDialogo
{
    public static void main(String[] args)
    {
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");

        String mensagem = String.format("Bem vindo, %s, a programação Java!", nome);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
