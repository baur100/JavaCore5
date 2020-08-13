package hw7;

public class Part3 {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 8, 4, 8, 5};

        // Max value
        System.out.println("Maximum of array = " + max(arr));

        //Min value
        System.out.println("Minimum of array = " + min(arr));
    }

    public static int max(int[] array) {
        int maxnumber = array[0];
        for (int v : array) {
            if (v > maxnumber) {
                maxnumber = v;
            }
        }
        return maxnumber;
    }

    public static int min(int[] array) {
        int minnumber = array[0];
        for (int v : array) {
            if (v < minnumber) {
                minnumber = v;
            }
        }
        return minnumber;
    }
}

