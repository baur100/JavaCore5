package hw7hw7;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        System.out.println(" ex 1");
        int[] arr = {2, 3, 5, 6, 7, 8};
        int[] arr1 = {3, 6, 8};
        int[] arr2 = {4, 9, 0, 7, 5};
        System.out.println(sum(arr));
        System.out.println(sum(arr1));
        System.out.println(sum(arr2));

        System.out.println(" ex 3");
        int[] a = {3, 9, 1, 8, 4, 8, 5};
        int[] a1 = {4, 9, 2, 5, -1, 3};
        int[] a2 = {4, 6, 4, 3};
        System.out.println(min(a));
        System.out.println(min(a1));
        System.out.println(min(a2));

        System.out.println(" ex 2");
        int[] z = {3, 9, 1, 8, 4, 8, 5};
        sort(z);
    }

    //              #1
    public static int sum(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum = sum + v;
        }
        return sum;
    }

    //             #3
    public static int min(int[] a) {
        int min = a[0];
        for (int v : a) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    //             #2
    public static void sort(int[] arrayLength) {
        Arrays.sort(arrayLength);
        for (int v : arrayLength) {
            System.out.println(v);
        }
    }

}

// 1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
//вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}
//2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
//вызовите этот метод внутри функии main()
//подайте в качестве параматра {3,9,1,8,4,8,5}
//3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
//(группа мак - макчимальное/ группа win - минимальное)
//подайте в качестве параматра {3,9,1,8,4,8,5}