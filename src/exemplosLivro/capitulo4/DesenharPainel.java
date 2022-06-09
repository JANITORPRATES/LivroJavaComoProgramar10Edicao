package exemplosLivro.capitulo4;

/*
 * Nome: DesenharPainel.java
 * Autor: Jânitor Prates
 * Objetivo: Utilizando drawLine para conectar os cantos de um painel.
 * */

import java.awt.Graphics;
import javax.swing.JPanel;

public class DesenharPainel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        // chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);

        int largura = getWidth();
        int altura = getHeight();

        // desenha uma linha a partir do canto superior esquerdo até o inferior direito
        g.drawLine(0,0,largura, altura);

        // desenha uma linha a partir do canto inferior esquerdo até o superior direito
        g.drawLine(0, altura, largura, 0);
    }

}
