package lesson5; // Функции которые будут что то возвращать

public class Part3 {
    public static void main(String[] args) {
        int xx = sum_of_three_numbers(2, 1, 1);
        System.out.println(xx);

        double sq = square_of_circle(5);
        System.out.println(sq);

        String a1 = getHi();
        System.out.println(a1);

        System.out.println(getHi());

        int[] arr={1,2,2,3,4,4,8,5,7,3,2,4,7};
        for(int y: arr){
            if(isOod(y)){
                System.out.println(y);
            }
        }

    }


    public static int sum_of_three_numbers(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public static double square_of_circle(double radius) {
        double sq = 3.14 * radius * radius;
        return sq;
    }

    public static String getHi() {
        return "Hi!";
    }

    public static boolean isOod(int number) {
        if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}