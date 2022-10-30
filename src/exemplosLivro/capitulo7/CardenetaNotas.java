package exemplosLivro.capitulo7;

public class CardenetaNotas {

    private String cursoNome;
    private int[][] notas;

    public CardenetaNotas(String cursoNome, int[][] notas){
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

        System.out.printf("%n%s %d%n%s %d%n%n", "A menor nota da cardeneta é", getMinimo(),
                "A maior nota da cardeneta é:", getMaximo());

        saidaGraficoBarra();
    }

    public int getMinimo(){

        int menorNota = notas[0][0];

        for(int[] notasEstudantes : notas){

            for(int nota : notasEstudantes){
                if(nota < menorNota)
                    menorNota = nota;
            }
        }

        return menorNota;
    }

    public int getMaximo(){

        int maiorNota = notas[0][0];

        for(int[] notasEstudantes : notas){

            for(int nota : notasEstudantes){
                if(nota > maiorNota)
                    maiorNota = nota;
            }
        }

        return maiorNota;
    }

    public double getMedia(int[] conjuntoNotas){
        int total = 0;

        for(int nota : conjuntoNotas)
            total += nota;

        return (double) total / conjuntoNotas.length;
    }

    public void saidaGraficoBarra()
    {
        System.out.println("Distribuição das notas");

        int[] frequencia = new int[11];

        for(int[] notasEstudante : notas)
        {
            for(int nota : notasEstudante)
                ++frequencia[nota / 10];

        }

        for (int i = 0; i < frequencia.length; i++)
        {
            if (i == 10)
                System.out.printf("%5d:  ", 100);
            else
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for(int astericos = 0; astericos < frequencia[i]; astericos++)
                System.out.print("*");

            System.out.println();
        }
    }

    public void saidaNotas()
    {
        System.out.printf("As notas são:%n%n");
        System.out.printf("                "); //alinha títulos de coluna

        for(int teste = 0; teste < notas[0].length; teste++)
            System.out.printf("Teste %d  ", teste + 1);

        System.out.println("Média");

        //cria linhas/colunas de texto que representam notas de array
        for(int estudante = 0; estudante < notas.length; estudante++)
        {
            System.out.printf("Estudante %2d", estudante + 1);

            for(int teste : notas[estudante])
                System.out.printf("%8d", teste);

            double media = getMedia(notas[estudante]);
            System.out.printf("%9.2f%n", media);

        }
    }

}
