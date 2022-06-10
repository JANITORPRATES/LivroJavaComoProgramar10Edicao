package exemplosLivro.capitulo5;

/*
 * Nome: Formas.java
 * Autor: Jânitor Prates
 * Objetivo: Desenhando uma cascata de formas com base na escolha do usuário.
 * */

import java.awt.Graphics;
import javax.swing.JPanel;

public class Formas extends JPanel
{
    private int escolha; // escolha do usuário de qual forma desenhar

    public Formas(int escolhaUsuario)
    {
        escolha = escolhaUsuario;
    }

    //desenha uma cascata de formas que iniciam do canto superior esquerdo
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for (int i = 0; i < 10; i++)
        {
            switch (escolha)
            {
                case 1:
                    g.drawRect(10 + i * 10, 10 + i *10,
                            50 + i * 10, 50 + i * 10);
                    break;
                case 2:
                    g.drawOval(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    break;
            }
        }
    }
}
