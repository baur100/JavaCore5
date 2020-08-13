package hw6;

public class Work {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c);

        sum(28,30);

        int x =sum1(23,67);
        System.out.println(x);
        System.out.println(isEven(12));

    }
    public static void sum (int a,int b){
        System.out.println(a+b);
    }
    public static int sum1(int a, int b){
        return a+b;
    }
    public static boolean isEven(int x){
        return x%2==0;
    }
}
