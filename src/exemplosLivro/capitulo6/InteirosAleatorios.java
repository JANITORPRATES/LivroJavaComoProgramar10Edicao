package exemplosLivro.capitulo6;

import java.security.SecureRandom;

public class InteirosAleatorios {

    public static void main(String[] parametros){

        SecureRandom numerosAleatorios = new SecureRandom();

        for(int i = 1; i <= 20; i++){

            int faceDado = 1 + numerosAleatorios.nextInt(6);

            System.out.printf("%d ", faceDado);

            if(i % 5 == 0){
                System.out.println();
            }

        }

    }
}
