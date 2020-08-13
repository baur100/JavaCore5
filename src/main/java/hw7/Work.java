package hw7;

import java.util.Arrays;

public class Work {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 9, 9};
        System.out.println(sum(arr1));

        int[] arr2 = {34, 56, 78, 90, 87};
        System.out.println(sum(arr2));

        sort(arr1);
        sort(arr2);
        System.out.println();
        System.out.println("minimum = " + min_max(arr1)[0] + " ," + min_max(arr1)[1]);
        System.out.println("minimum = " + min_max(arr2)[0] + " ," + min_max(arr2)[1]);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum = sum + v;
            //sum=0+1 (1)
            //sum=1+4 (5)
            //sum=5+9 (14)
            //sum=14+9 (23)
        }
        return sum;
    }

    public static void sort(int[] arr) {
        System.out.println();
        Arrays.sort(arr);
        for (int v : arr) {
            System.out.println(v);
        }
    }

    public static int[] min_max(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int v : arr) {
            if (v > max) {
                max = v;
            }
        }
        int[] result = {min, max};
        return result;
    }
}
