package hw7;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Hw7 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8};
        System.out.println("Sum ");
        System.out.println(sumOfArray(arr));

        System.out.println("Sort ");
        sort(arr);

        int[] a3 = {3,9,1,8,4,8,5};
        System.out.println("Max ");
        System.out.println(max(a3));
    }
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum += v;
        }
        return sum;
    }
    public static void sort(int[] arr) {
        Arrays.sort(arr);
        for(int v: arr){
            System.out.println(v);
        }

    }

        public static int max(int[]xx){
            int max = xx[0];
            for (int v : xx) {
                if(v>max){
                    max=v;
                }
            }
            return max;
        }

    }









