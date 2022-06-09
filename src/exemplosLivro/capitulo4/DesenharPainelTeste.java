package exemplosLivro.capitulo4;

/*
 * Nome: DesenharPainelTeste.java
 * Autor: Jânitor Prates
 * Objetivo: Criando JFrame para exibir um DesenharPainel.
 * */

import javax.swing.JFrame;

public class DesenharPainelTeste
{
    public static void main(String[] args)
    {
        // cria um painel que contém nosso desenho
        DesenharPainel painel = new DesenharPainel();

        // cria um novo quadro para armazenar o painel
        JFrame aplicacao = new JFrame();

        // configura o frame para ser encerrado quando ele é fechado
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacao.add(painel);
        aplicacao.setSize(500,500);
        aplicacao.setVisible(true);

    }
}
