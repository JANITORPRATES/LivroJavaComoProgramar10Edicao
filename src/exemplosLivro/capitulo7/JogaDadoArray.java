package exemplosLivro.capitulo7;

import java.security.SecureRandom;

public class JogaDadoArray {

    public static void main(String[] parametros){

        SecureRandom numerosAleatorios = new SecureRandom();
        int[] frequencia = new int[7];

        for(int jogaDado = 1; jogaDado < 6000000; jogaDado++)
            ++frequencia[1 + numerosAleatorios.nextInt(6)];

        System.out.printf("%s%10s%n", "Face", "Frequência");

        for(int face = 1; face < frequencia.length; face++)
            System.out.printf("%4d%10d%n", face, frequencia[face]);

    }
}
