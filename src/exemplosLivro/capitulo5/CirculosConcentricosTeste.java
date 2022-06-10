package exemplosLivro.capitulo5;

/*
 * Nome: CirculosConcentricosTeste.java
 * Autor: Jânitor Prates
 * Objetivo: Criando JFrame para exibir os 12 círculos concêntricos no centro de um JPanel
 * */

import javax.swing.*;

public class CirculosConcentricosTeste
{
    public static void main(String[] args)
    {
        CirculosConcentricos painel = new CirculosConcentricos();

        JFrame aplicacao = new JFrame();

        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(painel);
        aplicacao.setSize(500,500);
        aplicacao.setVisible(true);

    }
}
