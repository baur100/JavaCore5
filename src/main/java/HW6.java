public class HW6 {

    public static void main(String[] args) {
        sum(2, 3);

        int ee = sum2(5, 8, 9);
        System.out.println(ee);

        System.out.println(isEven(3));
        boolean xx = isEven(2);
        System.out.println(xx);




    }


    //    1.
    public static void sum(int a, int b) {
        System.out.println(a + b);

    }


    //    2.
    public static int sum2(int c, int d, int e) {
        int result2 = e + c + d;
        return result2;
    }


    //   3.

    public static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else{
            return false;
        }

    }
}

















