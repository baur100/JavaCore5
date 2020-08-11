package homework6;

public class HomeWork {
    public static void main(String[] args) {

        //Task displaying

        sum(5, 6);

        int xx = sum1(200, 300);
        System.out.println(xx);

        boolean yy = isEven(99);
        System.out.println(yy);
    }
//Task 1

    public static void sum(int a, int b) {
        int x = a + b;
        System.out.println(x);
    }
//Task 2

    public static int sum1(int c, int d) {
        int result = c + d;
        return result;
    }

    //Task 3

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
