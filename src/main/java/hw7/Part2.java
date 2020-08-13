package hw7;

public class Part2 {
    public static void main(String[] args) {
        int[] arr1 = {3, 9, 1, 8, 4, 8, 5};
        sort(arr1);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int rightnumber = array[i];
            for (int j = i - 1; j >= 0; j--) {
                int leftnumber = array[j];
                if (rightnumber < leftnumber) {
                    array[j + 1] = leftnumber;
                    array[j] = rightnumber;
                } else {
                    break;
                }
            }
        }
        for (int v : array) {
            System.out.println(v + ",");
        }
    }
}
