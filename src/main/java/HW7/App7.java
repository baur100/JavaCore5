package HW7;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Collections;

public class App7 {

    public static void main(String[] args) {


        int[] arrayX = {2, 3, 5, 6, 7, 8};
        int[] arrayH = {3, 9, 1, 8, 4, 8, 5};
        int[] arrayF = {3, 9, 1, 8, 4, 8, 5};


        System.out.print(minimum(arrayF));
        System.out.println(" = ArrayF Minimum");
        System.out.print(maximum(arrayF));
        System.out.println(" = ArrayF Maximum");

        System.out.print(sum(arrayX));
        System.out.println(" = ArrayX Summa");

        sort(arrayH);


    }

    private static int maximum(int[] array3) {


        int max= 0;

        for(int v: array3) {

            if (v > max) {
            max = v;
        }
      }
         return max;

    }

    private static int minimum(int[] array3) {

        int min = array3[0];

        for (int v : array3) {

            if (v < min) {
                min = v;
            }
        }
        return min;
}

    public static int sum(int[] array) {

        int summa = 0;
        for (int v : array) {
            summa += v;
        }
        return summa;
    }

    public static void sort(int[] array1) {


        System.out.println("sorting in in ascending order //solution 1");


        Arrays.sort(array1);
        for (int v : array1) {

            System.out.println(v);
        }


        System.out.println("//solution 2");
        int temp = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] > array1[j]) {
                    temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }
            System.out.println(array1[i]);
        }
    }


   }

