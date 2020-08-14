package hw7;

import java.util.Arrays;

public class Hw7 {
    public static void main(String[] args) {
        System.out.println("Task № 1:");
        int[] arrSum = {2, 3, 5, 6, 7, 8};
        System.out.println(sum(arrSum));

        System.out.println("Task № 2(option1):");
        int[] arrSort = {3, 9, 1, 8, 4, 8, 5};
        sort(arrSort);

        System.out.println("Task № 2(option2):");
        sort1(arrSort);


        System.out.println("Task № 3:");
        int[] arrMin = {3,9,1,8,4,8,7};
        System.out.println(min(arrMin));

    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) {
            s += v;
        }
        return s;
    }


    public static void sort1 (int[] arr){
        Arrays.sort(arr);
        for(int v: arr) {
            System.out.println(v);
        }

    }
    public static void sort(int[] arr) {
        int tmp =0;
        for (int i=0;i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for (int i=0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int min(int[]xx){
        int min = xx[0];
        for (int v: xx){
            if(v<min){
                min=v;
            }
        }
        return min;
    }
}

