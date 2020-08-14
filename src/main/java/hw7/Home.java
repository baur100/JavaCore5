package hw7;

public class Home {
    public static void main(String[] args) {

    }

    public static int max(int[] nmb) {
        int min = nmb[0];
        for (int v : nmb) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

}
