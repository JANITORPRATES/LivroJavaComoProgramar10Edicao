package exemplosLivro.capitulo8;

public enum Livro
{
    JHTP("Java como programar", "2015"),
    CHTP("C como programar", "2013"),
    IW3HTP("Internet e World Wide Web Como programar", "2012"),
    CPPHTP("C++ Como programar", "2014"),
    VBHTP("Visual Basic Como programar", "2014"),
    CSHARPHTP("Visual C# Como programar", "2014");

    private final String titulo;
    private final String anoCopyright;

    Livro(String titulo, String anoCopyright)
    {
        this.titulo = titulo;
        this.anoCopyright = anoCopyright;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getAnoCopyright()
    {
        return anoCopyright;
    }
}
