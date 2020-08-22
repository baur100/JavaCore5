package hw7;

import lesson8.Direction;

import java.util.Arrays;

public class hw {
    public static void main(String[] args) {
        // Ex 1
        int[] arr = {2,3,5,6,7,8};
        int sumOfArray = sum(arr);
        System.out.println(sumOfArray);

        // Ex2
        sort(arr);

        int x;
        Direction home = Direction.EAST;
    }

    private static void sort(int[] arr1) {
        Arrays.sort(arr1);
        for (int v : arr1) {
            System.out.println(v);
        }

    }

    private static int sum(int[] arr1) {
        int sum = 0;
        for(int v: arr1){
            sum+=v;
        }
        return sum;
    }
}
