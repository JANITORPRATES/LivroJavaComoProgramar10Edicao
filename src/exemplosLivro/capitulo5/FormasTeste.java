package exemplosLivro.capitulo5;

/*
 * Nome: FormasTeste.java
 * Autor: Jânitor Prates
 * Objetivo: Obtendo a entrada de usuário e criando um JFrame para exibir Formas.
 * */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormasTeste
{
    public static void main(String[] args)
    {
        String entrada = JOptionPane.showInputDialog(
                "Digite 1 para desenhar retângulos\n"+
                "Digite 2 para desenhar elipses");

        int escolha = Integer.parseInt(entrada);

        Formas painel = new Formas(escolha);

        JFrame aplicacao = new JFrame();

        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(painel);
        aplicacao.setSize(500,500);
        aplicacao.setVisible(true);

    }
}
