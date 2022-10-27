package exemplosLivro.capitulo6;

import java.util.Scanner;

public class EncontrarMaior {

    public static void main(String[] paramentos){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite três números de ponto flutuante separados por espaço ");

        double numero1 = entrada.nextDouble();
        double numero2 = entrada.nextDouble();
        double numero3 = entrada.nextDouble();

        double resultado = maximo(numero1, numero2, numero3);

        System.out.println("O maior valor dos três números é " + resultado);

    }

    public static double maximo (double x, double y, double z){

        double auxMaximo = x;

        if(y > auxMaximo){
            auxMaximo = y;
        }
        if(z > auxMaximo) {
            auxMaximo = z;
        }

        return auxMaximo;
    }
}
