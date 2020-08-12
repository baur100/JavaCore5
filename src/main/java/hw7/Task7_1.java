package hw7;

//1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
// вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}

public class Task7_1 {
    public static void main(String[] args) {
        int[] x = {2, 3, 5, 6, 7, 8};
        System.out.println("Sum of given array is: " + sum(x));
    }

    public static int sum(int[] x) {
        int sum1 = 0;
        for (int i : x) {
            sum1 += i;
        }
        return sum1;
    }
}

