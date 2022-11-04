package exemplosLivro.capitulo8;

public class Time1
{
    private int hora; // 0-23
    private int minuto;// 0-59
    private int secundo; // 0-59

    public void setTime(int hora, int minuto, int secundo)
    {
        if(hora < 0 || hora >=24 || minuto < 0 || minuto >= 60 || secundo < 0 || secundo >= 60)
        {
            throw new IllegalArgumentException("hora, minuto ou secundo  está fora do padrão");
        }

        this.hora = hora;
        this.minuto = minuto;
        this.secundo = secundo;
    }

    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", hora, minuto, secundo);
    }

    public String toString()
    {
        return String.format("%d:%02d:%02d %s",
                ((hora == 0 || hora == 12) ? 12 : hora % 12), minuto, secundo, (hora < 12 ? "AM" : "PM"));
    }

}
