package lesson7;

public class AppB {
    public static void main(String[] args) {
        int[] arr1 = {1,4,5,-20,12,15,67,89,0,0,45,-10};
        int[] arr2 = {6,4};
        int[] arr3 ={-5};

        System.out.println(max(arr1));
        System.out.println(max(arr2));
        System.out.println(max(arr3));
    }
    public static int max(int[]xx){
        int max = xx[0];
        for (int v : xx) {
            if(v>max){
                max=v;
            }
        }
        return max;
    }

}
