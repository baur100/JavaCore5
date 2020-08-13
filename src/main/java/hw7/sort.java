package hw7;

public class sort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8};
        System.out.println(sum(arr));
        int[] arr1 = {3, 9, 1, 8, 4, 8, 5};

        System.out.println();
        sort1(arr1);
        System.out.println();
        sort2(arr1);

        System.out.println();
        int max = max(arr1);
        System.out.println("Max number: " + max);

        System.out.println();
        int min = min(arr1);
        System.out.println("Min number: " + min);


    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum += v;
        }
        return sum;
    }

    public static void sort1(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort2(int[] arr) {
        int homework;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    homework = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = homework;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                min = arr[i];
            }
        }
        return min;
    }
}
