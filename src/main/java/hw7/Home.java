package hw7;

public class Home {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 8, 4, 8, 5};
        System.out.println(min(arr));
        System.out.println(max(arr));

    }

    public static int min(int[] nmb) {
        int min = nmb[0];
        for (int v : nmb) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    public static int max(int[] nmb) {
        int max = nmb[0];
        for (int v : nmb) {
            if (v > max) {
                max = v;

            }

            }
            return max;
        }
    }
