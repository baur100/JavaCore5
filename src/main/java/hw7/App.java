package hw7;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        //1
        int[] b = {2, 3, 5, 6, 7, 8};
        System.out.println(sum(b));
        //2
        System.out.println(" ");
        int[] c = {3, 9, 1, 8, 4, 8, 5};
        sort(c);
        //3
        System.out.println(" ");
        int []a={3,9,1,8,4,8,5};
        System.out.println(min(a));

    }
    //1
    public static int sum(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum += v;
        }
        return sum;
    }
    //2
    public static void sort(int[] arr) {
        Arrays.sort(arr);
        for (int v : arr) {
            System.out.println(v);
        }

   }
   //3
    public static int min(int[]x){
        int min= x[0];
        for (int v:x){
            if(v<min){
                min=v;}
            }
            return min;
        }

}





