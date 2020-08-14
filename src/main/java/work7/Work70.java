package work7;

public class Work70 {
    public static void main(String[] args) {

        System.out.println(sumOgThreeNumbers(1,1,3));

        System.out.println(sum(1,5));
        System.out.println(sum(1.2,5));
        System.out.println(sum("hi","5"));
        System.out.println(sum(1,4,5));
    }

    public static int sumOgThreeNumbers(int a1, int a2, int a3) {
        return a1 + a2 + a3;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a1,double a2){
        return a1+a2;
    }

    public static String sum(String a, String b){
        return a+b;
    }
    public static int sum(int a,int b,int c) {
        return a + b + c;
    }

}
