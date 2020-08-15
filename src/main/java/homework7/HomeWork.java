package homework7;

import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 7, 8};
        int sumArray = sum(arr);
        System.out.println("         ");
        System.out.println("Answer 1:");
        System.out.println(sum(arr));
        System.out.println("---------");
        System.out.println("         ");

        int[] arr1 = {3, 9, 1, 8, 4, 8, 5};
        System.out.println("Answer 2:");
        sort(arr1);
        System.out.println("---------");
        System.out.println("         ");

        int[] arr2 = {3, 9, 1, 8, 4, 8, 5};
        System.out.println("Answer 2:");
        System.out.println("Max number is " + max(arr2));
        System.out.println("Min number is " + min(arr2));
        System.out.println("---------");

    }

    //Task 1
    public static int sum(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum += v;
        }
        return sum;
    }

    //Task 2
    private static void sort(int[] arr1) {
        Arrays.sort(arr1);
        for (int v : arr1) {
            System.out.println(v);
        }
    }

    //Task 3
    public static int max(int[] arr2) {
        int max = arr2[0];
        for (int v : arr2) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    public static int min(int[] arr2) {
        int min = arr2[0];
        for (int v : arr2) {
            if (v < min) {
                min = v;
            }
            return min;
        }
        return min;
    }
}

        
