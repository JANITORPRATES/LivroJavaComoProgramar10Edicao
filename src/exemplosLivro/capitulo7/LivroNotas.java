package exemplosLivro.capitulo7;

public class LivroNotas {

    private String cursoNome;
    private int[] notas;

    public LivroNotas(String cursoNome, int[] notas){

        this.cursoNome = cursoNome;
        this.notas = notas;
    }

    public void setCursoNome(String cursoNome){
        this.cursoNome = cursoNome;
    }

    public String getCursoNome(){
        return cursoNome;
    }

    public void processaNotas(){

        saidaNotas();

        System.out.printf("%nMédia da classe é %.2f%n", getMedia());

        System.out.printf("Nota mais baixa é %d%nNota mais alta é %d%n%n", getMinimo(), getMaximo());

        saidaGraficoBarra();
    }

    public int getMinimo(){
        int notaBaixa = notas[0]; //supõe que notas[0] é a menor nota

        for(int nota : notas){

            if(nota < notaBaixa)
                notaBaixa = nota; //nova nota mais baixa
        }

        return notaBaixa;

    }

    public int getMaximo(){
        int notaAlta = notas[0]; //supõe que nota[0] é a maior nota

        for(int nota : notas){

            if(nota > notaAlta)
                notaAlta = nota;
        }

        return notaAlta;
    }

    public double getMedia(){
        int total = 0;

        for(int nota : notas)
            total += nota;

        return (double) total / notas.length;
    }

    public void saidaGraficoBarra(){

        System.out.println("Distribuição das notas:");

        int[] frequencia = new int[11];

        for(int nota : notas)
            ++frequencia[nota / 10];

        for(int i = 0; i < frequencia.length; i++){

            //gera saída do rótulo de barra ("00-09: ", ..., "90-99: ", "100:")
            if(i == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            //imprime a barra de asteriscos
            for(int astericos = 0; astericos < frequencia[i]; astericos++)
                System.out.print("*");

            System.out.println();
        }


    }

    public void saidaNotas(){
        System.out.printf("As notas são:%n%n");

        //gera a saída da nota de cada aluno
        for(int estudante =0; estudante < notas.length; estudante++)
            System.out.printf("Estudante %2d: %3d%n", estudante + 1, notas[estudante]);
    }

}
