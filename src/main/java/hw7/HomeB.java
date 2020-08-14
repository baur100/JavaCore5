package hw7;

public class HomeB {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8};
        int sumOfArray = sum(arr);
        System.out.println(sumOfArray);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int v : arr)
        {
            sum += v;
        }
        return sum;
    }
}



