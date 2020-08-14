package work8;

public class Work80 {
    public static int xx = 7;
    public static String HI = "Hi";

    public static void main(String[] args) {
        final int WEIGHT = 50;

        Colors col = Colors.GREEN;
        Colors col1 = Colors.BLUE;
        System.out.println(col);
        System.out.println(col1);
//        "Red"   "RED"   "red"
        Colors red = Colors.RED;
    }

    public static void hello() {
        System.out.println("Hello" + xx + HI);
    }
}
