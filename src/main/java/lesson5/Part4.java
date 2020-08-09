package lesson5;

public class Part4 {
    public static void main(String[] args) {
        int[] a1={1,1,2,34,665,7,6,-658,34};
        System.out.println(sumOfArray(a1));

        int[] b1={2,2};
        System.out.println(sumOfArray(b1));

    }
    public static int sumOfArray(int[] arr){
        int sum=0;
        for(int v:arr){
            sum+=v;
        }
        return sum;
    }

}
