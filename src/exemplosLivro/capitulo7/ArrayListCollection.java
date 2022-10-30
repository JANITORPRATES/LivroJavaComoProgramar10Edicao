package exemplosLivro.capitulo7;

import java.util.ArrayList;

public class ArrayListCollection
{
    public static void main(String[] args)
    {
        ArrayList<String> itens = new ArrayList<String>();

        itens.add("vermelho");
        itens.add(0,"Amarelo"); //insere "amarelo" no indice 0

        System.out.print("Mostrar o conteúdo da lista com loop controlado por contador");

        //exibe as cores na lista
        for(int i = 0; i < itens.size(); i++)
            System.out.printf(" %s", itens.get(i));

        //exibe as cores usando for aprimorado no método exibir
        exibir(itens, "%nExibir o conteúdo da lista com instrução for aprimorada");

        itens.add("Verde"); // adiciona verde ao fim da lista
        itens.add("Amarelo"); //adiciona amarelo ao fim da lista
        exibir(itens, "Lista com dois novos elementos:");

        itens.remove("Amarelo");//remove o primeiro "Amarelo"
        exibir(itens, "Remove a primeira instancia de amarelo:");

        itens.remove(1); //remove o item no índice 1
        exibir(itens, "Remove o segundo elemento da lista (verde)");

        //verifica se um valor está na lista
        System.out.printf("\"vermelho\' está %sna lista%n", itens.contains("vermelho") ? "" : "não");

        //exibe o número de elementos na lista
        System.out.printf("Size: %s%n", itens.size());
    }

    public static void exibir(ArrayList<String> itens, String cabecalho)
    {
        System.out.printf(cabecalho);

        for(String item : itens)
            System.out.printf(" %s", item);

        System.out.println();

    }
}
