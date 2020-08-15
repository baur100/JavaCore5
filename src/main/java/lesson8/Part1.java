package lesson8;

public class Part1 {
    public static int xx = 7;      //{}- говорят что наша функция находиться на уровне (с глобальные переменными)
    public static String HI = "Hi";

    public static void main(String[] args) {
        //Constanta -переменные не меняющие значения
        final int WEIGHT = 50; //Название константы нужно писать всегда большими буквами
        System.out.println(xx);
    }

    public static void hello() {
        System.out.println("Hello!" + xx + HI);

    }
}
