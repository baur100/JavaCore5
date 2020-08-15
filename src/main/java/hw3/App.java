package hw3;
//1. create Array with int - at least 7 values- ex.[2,76,9,90,31,76,2,76,21,12], print out it values
//2. Create an empty array with 5 values, fill it out with values, print it out
//3. Create an array of booleans, fill it by values, print it out

public class App {

    public static void main(String[] args) {
//1
        int[] arr1 = {2, 39, 83, 39, 3, 39, 33};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        System.out.println(arr1[5]);
        System.out.println(arr1[6]);
        System.out.println(arr1.length-1);

//2
        int[] arr2 = new int[5];
        arr2[0] = 25;
        arr2[1] = 34;
        arr2[2] = 9;
        arr2[3] = 15;
        arr2[4] = 30;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);
        System.out.println(arr2[arr2.length-1]);

//3
     boolean[] arr3 = new boolean[4];
     arr3[0] = true;
     arr3[1] = false;
     arr3[2] = 4>5;
     arr3[3] = 8<8;
     System.out.println(arr3[0]);
     System.out.println(arr3[1]);
     System.out.println(arr3[2]);
     System.out.println(arr3[4]);
     System.out.println(arr3[arr3.length-2]);

    }
}
