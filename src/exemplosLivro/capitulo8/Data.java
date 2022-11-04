package exemplosLivro.capitulo8;

public class Data {

    private int mes; // 1-12
    private int dia; //1-31 conforme o mês
    private int ano;

    private static final int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Data(int dia, int mes, int ano){
        //verifica se o dia está no intervalo para o mês
        if(mes <= 0 || mes > 12)
            throw new IllegalArgumentException("mes ( " + mes + ") deve ser dentro do intervalo 1-12");
        //o teste do intervalo do mês deve ser feito primeiro para não estourar o index do array diasPorMes[]

        if(dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29)))
            throw new IllegalArgumentException("dia (" + dia + ") está fora do intervalo especificado para mes e ano" );

        //verifica se o ano é bissexto, se o mês é 2 e se o dia é 29
        if(mes == 2 && dia == 29 && !(ano % 400 == 0 ||
                (ano % 4 == 0 && ano % 100 != 0 )))
            throw new IllegalArgumentException("dia (" + dia + ") está fora do intervalo para o mês e ano");

        this.mes = mes;
        this.dia = dia;
        this.ano = ano;

        System.out.printf("Construtor do objeto Data para a data %s%n", this);
    }

    public String toString(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
