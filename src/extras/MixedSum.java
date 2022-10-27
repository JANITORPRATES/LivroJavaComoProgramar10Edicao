package extras;

import java.util.Arrays;
import java.util.List;

/*
Dado um array de inteiros como strings e números, retorne a soma dos valores do array
como se todos fossem números. Devolva sua resposta como um número.
 */
public class MixedSum {

    public static void main(String[] args){
       System.out.println(sum(Arrays.asList(9, 3, "7", "3")));
    }

    public static int sum(List<?> mixed) {

        int soma = 0;

        for (Object s : mixed)
            soma += Integer.parseInt(s.toString());
        return soma;
    }
/*
  public int sum(List<?> mixed) {
    return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
  }

 public int sum(List<?> mixed) {
      int sum = 0;

      for (Object element : mixed)
      {
        if (element instanceof Integer)
        {
          sum += (Integer) element;
        }
        else if (element instanceof String){
        sum += Integer.parseInt( (String) element );
        }
      }
      return sum;
  }
 */
}
