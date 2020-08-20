package hw66;

public class First {

    int[] arr = {2,3,5,6,7,8};
    int sumofarray;
    public static void main(String[] args) {

        int[] arr = {2,3,5,6,7,8};
        int sumofarray = sum(arr);
        System.out.println(sumofarray);

    }

    private static int sum(int[] arr) {

        int sum = 0;
        for(int v: arr){
            sum+=v;
        }
        return sum;
    }
}
