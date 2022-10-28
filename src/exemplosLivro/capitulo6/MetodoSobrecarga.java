package exemplosLivro.capitulo6;

public class MetodoSobrecarga {

    public static void main(String[] parametros){

        System.out.printf("O quadrado do número inteiro 7 é %d%n", quadrado(7));
        System.out.printf("O quadrado do número double 7.5 é %f%n", quadrado(7.5));
    }

    public static int quadrado(int valorInteiro){

        System.out.printf("%nChamando o método quadrado com um argumento inteiro: %d%n", valorInteiro);
        return valorInteiro * valorInteiro;
    }

    public static double quadrado(double valorDouble){
        System.out.printf("%nChamando o método quadrado com um argumento double: %d%n", valorDouble);
        return valorDouble * valorDouble;
    }
}
