package hw6;

public class hw {
    public static void main(String[] args) {
        // Ex 1
        System.out.println(" ex 1");
        sum(1,3);

        // Ex 2
        System.out.println("\n ex 2");
        int x=sum1(2,3);
        System.out.println(x);

        System.out.println(sum1(3,3));

        // Ex 3
        System.out.println("\n ex 3");
        System.out.println(isEven(15));


    }
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static int sum1(int a, int b){
        return a+b;
    }
    public static boolean isEven(int x){
        return x%2==0;
    }
}
