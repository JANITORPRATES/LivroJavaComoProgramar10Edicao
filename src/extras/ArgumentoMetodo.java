package extras;

public class ArgumentoMetodo {

    public static void main(String[] parametros){

        int x = 10;
        System.out.println("Valor inicial de x dentro do main " + x);

        dobraValor(x);
        System.out.println("Valor de x dentro do main " + x);

        ArgumentoMetodo teste = new ArgumentoMetodo();
        teste.triplica(x);

        x = teste.triplica(x);

        Math.sqrt(x);

        System.out.println("Novo valor de x dentro do metodo main " + x);

        double y = teste.triplica(x);

        System.out.println("O valor de y dentro do metodo main " + y);


        double k = x;

        System.out.println("O valor de k é igual o valor de x " + k);
    }

    public static void dobraValor(double x){
        x = 2 * x;
        System.out.println("Valor de x dentro do metodo dobraValor " + x );
    }

    public int triplica(int x){

        x = x * 3;

        System.out.println("Valor de x dentro do metodo triplica " + x);

        return x;
    }

    public double triplica(double x){

        x = x * 3;

        System.out.println("Valor de x dentro do metodo triplica " + x);

        return x;
    }
}
