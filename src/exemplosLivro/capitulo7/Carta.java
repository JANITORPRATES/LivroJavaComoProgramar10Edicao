package exemplosLivro.capitulo7;

public class Carta {

    private final String face; //face da carta às a rei
    private final String naipe;

    public Carta(String faceCarta, String naipeCarta){
        this.face = faceCarta;
        this.naipe = naipeCarta;
    }

    @Override
    public String toString(){
        return face + " de " + naipe;
    }
}
