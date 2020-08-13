package hw5;

public class work {
    public static void main(String[] args) {
       //Task #1 result
        System.out.println("Function result #1");
        sum(22,33);
       //Task #2 result
        int f=sum1(12,13);
        System.out.println("Function result #2 = " + f);
        //Task #3 result
        boolean h=ifEven(12);
        System.out.println("Function result #3 = " + h);
        //Task #3.1
        boolean k=ifEven1(13);
        System.out.println("Function result #3.1 = " + k);

    }
    //Task #1
    public static void sum(int a,int b){
       int sum= a+b;
       System.out.println(sum);
    }
    //Task #2
    public static int sum1(int c,int d){
       return c+d;
    }
    //Task #3
    public static boolean ifEven(int g){
        if(g%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    //Task #3.1
    public static boolean ifEven1(int j) {
        return j % 2 == 0;
    }
    public static boolean k(int p){
        return p % 2!=0;
    }
}
