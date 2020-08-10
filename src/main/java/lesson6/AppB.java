package lesson6;

public class AppB {
    public static void main(String[] args) {
        int xx = sum_of_three_numbers(2,1,1);
        System.out.println(xx);

        double squ = squareOfCircle(5);
        System.out.println(squ);

        String a1 = getHi();
        System.out.println(a1);

        System.out.println(getHi());


        int[] arr = {1,2,2,3,3,4,8,5,7,3,2,4,7};

        for (int v: arr){
            if(isOdd(v)){
                System.out.println(v);
            }
        }
    }

    public static int sum_of_three_numbers(int a, int b, int c){
        int result = a+b+c;
        return result;
    }

    public static double squareOfCircle(double radius){
        double sq = 3.14*radius*radius;
        return sq;
    }

    public static String getHi(){
        return "Hi!";
    }

    public static boolean isOdd(int number){
        if(number%2==1){
            return true;
        } else {
            return false;
        }
    }

}
