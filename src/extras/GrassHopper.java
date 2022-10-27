package extras;

public class GrassHopper {

    public static void main(String[] args){
        System.out.println(summation(8));
    }

    public static int summation(int n) {
        int soma = 0;
        for(int i = 0; i <= n; i++){
            soma += i;
        }

        return soma;
    }
}
