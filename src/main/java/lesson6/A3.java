package lesson6;

public class A3 {
    public static void main(String[] args) {
       int x = sumofthree(5,6,8);
        System.out.println(x);

        System.out.println(circlesquare(5.5));

    }
    public static int sumofthree(int a, int b, int c){
        int result = a+b+c;
        return result;
    }
    public static double circlesquare( double radius){
        double sq = 3.14*radius*radius;
        return sq;
    }
//    public static int num ()
}
