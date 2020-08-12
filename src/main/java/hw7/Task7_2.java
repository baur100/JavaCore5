package hw7;

import java.util.Arrays;

//2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
//вызовите этот метод внутри функии main()
//подайте в качестве параматра {3,9,1,8,4,8,5}
public class Task7_2 {
    public static void main(String[] args) {

        int[] arr = {3,9,1,8,4,8,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] x){
        Arrays.sort(x);

    }
}
