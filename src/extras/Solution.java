package extras;
/*
Escreva uma função chamada repeatStr que repete a string dada exatamente n vezes.
 */

public class Solution {

    public static void main(String[] args){
        System.out.println(repeatStr(3, "teste"));

    }
    public static String repeatStr(final int repeat, final String string) {

        String repeticao = "";

        for (int i = 1; i <= repeat; i++){
            repeticao = repeticao + string;
        }
        return repeticao;
    }

    /*
    class Solution {
          static String repeatStr(int repeat, String string) {
            return string.repeat(repeat);
          }
        }
     */
}
