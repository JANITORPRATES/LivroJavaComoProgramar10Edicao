package exemplosLivro.capitulo7;

public class LivroNotasTeste {

    public static void main(String[] args){

        int[] notasArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        LivroNotas meuLivroNotas = new LivroNotas(
                "Introdução a programação Java", notasArray);
        System.out.printf("Bem vindo ao livro de notas para%n%s%n%n", meuLivroNotas.getCursoNome() );
        meuLivroNotas.processaNotas();
    }
}
