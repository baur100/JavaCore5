package HW4;

import java.util.Arrays;

public class App4 {

    public static void main(String[] args) {


        int[] array = {2, 76, 9, 90, 31, 76, 6, 88, 21, 12};

        for (int v : array) {
            System.out.println(v);
        }

        //--------------------------------------------------

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        //------------------------------------------------------

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
        //------------------------------------------------------
        int max = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];

            }

        }
        System.out.println(max);

        //------------------------------------------------------

        int min = 100;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }

            System.out.println(min);

            //------------------------------------------------------


            for (i = 0; i < array.length; i++) {

                if (array[i] % 2 != 0) {
                    System.out.println(array[i]);
                }
            }


        }


        int[] array5 = {10,15,12,7,88,10,6,17,23,10,10,16};


       // public static void getIndex(int[] arr){

            for (int i = 0; i < array5.length; i++) {
                if (array5[i] == 10) {
                    System.out.println(i);
                }
            }
       // }


    }
}