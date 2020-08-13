package lesson7;

public class App {
    public static void main(String[] args) {
        System.out.println(sum(1,5));
        System.out.println(sum(1.2,5));
        System.out.println(sum("Hi-","5"));
        System.out.println(sum(1,4,5));
    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a1, double a2){
        return a1+a2;
    }
    public static String sum(String a, String b) {
        return a+b;
    }
    public static int sum(int a,int b, int c){
        return a+b+c;
    }

}
