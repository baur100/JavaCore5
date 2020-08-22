package lesson8;

public class App {
    public static int xx=7;
    public static String HI = "Hi";

    public static void main(String[] args) {
        final int WEIGHT = 50;
        System.out.println(xx);

        Colors col = Colors.GREEN;
        Colors col1 = Colors.ORANGE;
        System.out.println(col);
        System.out.println(col1);

        // "Red" "RED" "red"
        Colors red = Colors.RED;

        if(col==col1){
            int xxx = 7;
            System.out.println("Good");
        }
    }

    public static void hello(){
        System.out.println("hello"+xx+HI);
    }
}
