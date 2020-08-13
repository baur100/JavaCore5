package hw7;

public class Part1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8};
        System.out.println("Sum of array =" + sum(arr));
    }

    public static int sum(int[] arr) {
        int value = 0;
        for (int v : arr) {
            value += v;
        }
        return value;
    }
}
