package exemplosLivro.capitulo6;
/*
 * Nome: Robo.java
 * Autor: Jânitor Prates
 * Objetivo: Exemplo de uso prático do static
 * */

public class Robo
{
        public int x;

        public int y;

        public static int quantos; //quantos foram instanciados

        public Robo(int ax,int ay)

        {
            x=ax;
            y=ay;

            quantos++;
        }


}
