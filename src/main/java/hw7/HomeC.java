package hw7;

import java.util.Arrays;

public class HomeC {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 8, 4, 8, 5};
        int sumOfArray = sort(arr);
    }

    public static int sort(int[] arr) {
        Arrays.sort(arr);
        for (int v : arr) {
            System.out.println(v);
        }
        return 0;
    }

}
