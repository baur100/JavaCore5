package hw7;

public class Home {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8};
        System.out.println(max(arr));
    }
    public static int max(int[]xx){
        int max = xx[0];
        for (int v : xx) {
            if(v>max){
                max=v;}
        }
        return max;
    }

}
