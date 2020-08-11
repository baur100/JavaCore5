package hw5;

public class hw6 {
    public static void main(String[] args) {
        sum(2, 3);
        int sumOfTwoNumbers = sum1(5, 4);
        System.out.println(sumOfTwoNumbers);
        boolean evenOdd = isEven(5);
        System.out.println(evenOdd);

    }

    public static void sum(int a, int b) {
        System.out.println("Adding " + a + " and " + b + " gives the result " + (a + b) + ".");
    }

    public static int sum1(int a, int b) {
        int result = a + b;
        return result;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
