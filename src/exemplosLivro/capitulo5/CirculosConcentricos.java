package exemplosLivro.capitulo5;

/*
 * Nome: CirculosConcentricos.java
 * Autor: Jânitor Prates
 * Objetivo: Desenhando  12 círculos concêntricos no centro de um JPanel
 * */

import javax.swing.JPanel;
import java.awt.Graphics;

public class CirculosConcentricos extends JPanel
{
    public void paintComponent(Graphics g)
    {
        // chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);

        int largura = getWidth() / 2;
        int altura = getHeight() / 2;
        int diametro = 30;
        int raio = diametro / 2;

        for (int i = 1; i <= 12; i++){
            g.drawOval(largura - i * raio, altura - i * raio,
                     i * diametro, i * diametro);
        }

    }

}
