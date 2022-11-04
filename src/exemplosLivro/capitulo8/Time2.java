package exemplosLivro.capitulo8;

public class Time2
{
    private int hora;
    private int minuto;
    private int segundo;

    public Time2()
    {
        this(0, 0,0);//invoca o construtor com três argumentos
    }

    public Time2(int hora)
    {
        this(hora, 0, 0);
    }

    public Time2(int hora, int minuto)
    {
        this(hora, minuto, 0);
    }
    public Time2(int hora, int minuto, int segundo)
    {
        if(hora < 0 || hora >= 24)
            throw new IllegalArgumentException("Hora deve ser 0-23");

        if(minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("Minuto deve ser 0-59");

        if(segundo < 0 || segundo >=  60)
            throw new IllegalArgumentException("Segundo deve ser 0-59");

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

    }

    public Time2(Time2 time)
    {
        this(time.getHora(), time.getMinuto(), time.getSegundo());
    }

    public void setTime(int hora, int minuto, int segundo)
    {
        if(hora < 0 || hora >= 24)
            throw new IllegalArgumentException("Hora deve ser 0-23");

        if(minuto < 0 || minuto >=60)
            throw new IllegalArgumentException("Minuto deve ser 0-59");

        if(segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("Segundo deve ser 0-59");

        System.out.println("teste se lançãdo throw o programa continua ou não");

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void setHora(int hora)
    {
        if(hora < 0 || hora >= 24)
            throw new IllegalArgumentException("Hora deve ser 0-23");
        this.hora = hora;
    }

    public void setMinuto(int minuto)
    {
        if(minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("Minuto deve ser 0-59");
        this.minuto = minuto;
    }

    public void setSegundo(int segundo)
    {
        if(segundo < 0 || segundo >= 60)
            throw new IllegalArgumentException("Segundo deve ser 0-59");
        this.segundo = segundo;
    }

    public int getHora()
    {
        return hora;
    }

    public int getMinuto(){
        return minuto;
    }
    public int getSegundo(){
        return segundo;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
                getMinuto(), getSegundo(), (getHora() < 12 ? "AM" : "PM"));
    }
}
