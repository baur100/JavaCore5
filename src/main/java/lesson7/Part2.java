package lesson7;

import java.sql.SQLOutput;

public class Part2 {
    public static void main(String[] args) {
//        System.out.println(getHello());
//        System.out.println("Price is: " + getTicketsPrice(1000, 2));
        int[] arr1={1,4,5,-20,12,15,67,89,0,0,45,-10};
        int[] arr2={6,4};
        int[] arr3={-5};
        System.out.println(max(arr1));
        System.out.println(max(arr2));
        System.out.println(max(arr3));
    }

//    public static String getHello() {
//        return "Hello!";
//    }
//
//    public static double getTicketsPrice(int fare, int age) {
//        if (age < 3) {
//            return 0;
//        }
//        if (age < 13) {
//            return fare * 0.5;
//        }
//        if (age < 66) {
//            return fare;
//        }
//        return fare * 0.8;
//    }

    public static int max(int[]xx){
        int max=xx[1];
        for(int v:xx){
            if (v>max){
                max=v;
            }
        }
        return max;
    }
}
