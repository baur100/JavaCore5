package hw7;

public class Hw7 {
    public static void main(String[] args) {
        System.out.println("Task № 1:");
        int[] arrSum = {2, 3, 5, 6, 7, 8};
        System.out.println(sum(arrSum));
        System.out.println("Task № 2:");
        int[] arrSort = {3, 9, 1, 8, 4, 8, 5};
        System.out.println(sort(arrSort));

    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) {
            s += v;
        }
        return s;
    }

    public static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

