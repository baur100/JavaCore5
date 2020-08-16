package HW5;

public class App5 {

    public static void main(String[] args) {


        int result = sum(2, 3);
        System.out.println(result);
        sum2(3, 3);
        sum3();
        Boolean even = isEven(2);
        Boolean odd = isEven(3);
        System.out.println(even);
        System.out.println(odd);
    }


    // разные виды функций

    public static int sum(int a, int b) {
        return a + b;
    }


    public static void sum2(int a, int b) {
        System.out.println(a + " " + b);
    }

    public static void sum3() {
        int a = 2;
        int b = 3;
        System.out.println(a + b);
    }

    public static boolean isEven(int a) {

        if (a % 2 == 0) {
            return true;
        } else
            return false;
    }





}
