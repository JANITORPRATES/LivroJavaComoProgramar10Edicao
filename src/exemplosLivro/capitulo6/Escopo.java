package exemplosLivro.capitulo6;

public class Escopo {

    private static int x = 1;

    public static void main(String[] parametro){
        //campo acessível para todos os métodos dessa classe
        int x = 5;

        System.out.printf("Variável x local em main é %d%n ", x);

        useLocalVariavel();
        useCampo();
        useLocalVariavel();
        useCampo();

        System.out.printf("Variável x local em main é %d%n ", x);
    }

    public static void useLocalVariavel(){
        int x = 25;

        System.out.printf("%nVariavel x local em useLocalVariavel é %d%n", x);
        ++x;
        System.out.printf("Variavel x local em useLocalVariavel antes de sair do método useLocalVariable é %d%n", x);
    }

    public static void useCampo(){

        System.out.printf("%nCampo (variável de instância) x ao entrar no método useCampo %d%n",x);
        x *= 10;

        System.out.printf("%nCampo x antes de sair do método useCampo %d%n",x);
    }
}
