package hw6;

public class hw {
    public static void main(String[] args) {
        // Exercise 1
        System.out.println(" Exercise #1");
        System.out.println("============");
        sum(1,3);
        System.out.println("============");

        // Exercise 2
        System.out.println("\n Exercise #2");
        int x=sum1(2,3);
        System.out.println("============");
        System.out.println(x);
        System.out.println("============");


        // Exercise 3
        System.out.println("\n Exercise #3");
        System.out.println("============");
        System.out.println(isEven(15));
        System.out.println("============");


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
