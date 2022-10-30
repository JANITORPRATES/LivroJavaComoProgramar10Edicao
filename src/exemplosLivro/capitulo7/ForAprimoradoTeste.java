package exemplosLivro.capitulo7;

public class ForAprimoradoTeste {

    public static void main(String[] args)
    {
        int [] array = { 85, 74, 85, 96, 75, 23, 45, 63, 78};
        int total = 0;

        //adiciona o valor de cada elemento ao total
        for(int numero : array)
            total+= numero;

        System.out.printf("Soma total dos elementos do array: %d%n", total);
    }
}
