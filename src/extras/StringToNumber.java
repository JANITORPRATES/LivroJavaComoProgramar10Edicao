package extras;
/*
Precisamos de uma função que possa transformar uma string em um número.
 Que formas de conseguir isso você conhece?

Nota: Não se preocupe, todas as entradas serão strings e cada string é
 uma representação perfeitamente válida de um número inteiro.
 */

public class StringToNumber {

    public static void main(String[] args){

        System.out.println(stringToNumber("1405"));
    }

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

}
