package lesson6;

public class lesson6UEHW1 {
    public static void main(String[] arrgs) {
        int[] a25 = {25, 36, 66, 99, 885, 5555};
        System.out.println(sumOfArray(a25));

        int[] b35 = {33, 66, 88};
        System.out.println(sumOfArray(b35));
    }
        public static int sumOfArray(int[] arr){
          int sum = 0;
          for(int v:arr) {
              sum += v;
          }
          return sum;

        }
    }

