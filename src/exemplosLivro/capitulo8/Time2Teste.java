package exemplosLivro.capitulo8;

public class Time2Teste
{
    public static void main(String[] args)
    {
        Time2 t1 = new Time2();// 00:00:00
        Time2 t2 = new Time2(2);//02:00:00
        Time2 t3 = new Time2(21, 34); //21:34:00
        Time2 t4 = new Time2(12, 25, 42); //12:25:42
        Time2 t5 = new Time2(t4); // 12:25:42

        System.out.println("Construído com:");
        mostrarTime("t1: todos os argumentos padrão", t1);
        mostrarTime("t2: hora especifica; minuto e segundo padrão", t2);
        mostrarTime("t3: hora e minuto especifico; segundo padrão", t3);
        mostrarTime("t4: hora, minuto e segundo especifico", t4);
        mostrarTime("t5: Time2 objeto t4 especifico", t5);

        try
        {
            Time2 t6 = new Time2(27, 74, 99); // valores inválidos
        }
        catch (IllegalArgumentException e){
            System.out.printf("%nExceção enquanto inicializa t6: %s%n", e.getMessage());
        }

        Time2 t7 = new Time2();
        try
        {
            t7.setTime(25, 99, 99);
        } catch (IllegalArgumentException e){
            System.out.printf("%nExceção enquanto inicializa t7: %s%n", e.getMessage());
        }


        mostrarTime("t7: setado valores invalidos", t7);

    }

    private static void mostrarTime(String cabecalho, Time2 t){
        System.out.printf("%s%n  %s%n  %s%n", cabecalho,
                t.toUniversalString(), t.toString());

    }
}
