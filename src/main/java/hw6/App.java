package hw6;

public class App {
    public static void main(String[] args) {
        //1
        sum(6,8);

        //2
        int f = sum1(3, 7);
        System.out.println(f);
        System.out.println(" ");

        //3
        System.out.println(isEven(6));
    }

    public static void sum(int a, int b) {
        System.out.println("The first number is "+ a+ " and second number is " +b+".");
    }

    public static int sum1(int x, int y) {
        int result = x + y;
        return result;
    }

    public static boolean isEven(int h) {
        if (h % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}



