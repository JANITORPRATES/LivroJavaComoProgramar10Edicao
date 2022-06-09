package exemplosLivro.capitulo4;

/*
 * Nome: Estudante.java
 * Autor: Jânitor Prates
 * Objetivo: Classe Estudante que armazena o nome e a média de um aluno.
 * */

public class Estudante
{
    private String nome;
    private double media;

    public Estudante(String nome, double media)
    {
        this.nome = nome;

        if(media > 0.0)
            if(media <=100.0)
                this.media = media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setMedia(double media){
        if(media > 0.0)
            if(media <= 100.0)
                this.media = media;
    }

    public double getMedia(){
        return media;
    }

    public String getNotaLetra(){
        String notaLetra = "";

        if(media >= 90.0)
            notaLetra = "A";
        else if (media >= 80.0)
            notaLetra = "B";
        else if (media >= 70.0)
            notaLetra = "C";
        else if (media >= 60.0)
            notaLetra = "D";
        else
            notaLetra = "F";

        return notaLetra;

    }

}
