package lesson7;

public class Part1 {
    public static void main(String[] args) {  //Функции не живут внутри друг друга, но мы можем вызывать их из друг друга

        //Function overloading когда мы имеем одно название функции но разные её решения
        System.out.println(sum(1,5));
        System.out.println(sum(1.2,5));
        System.out.println(sum("Hello ","5"));
        System.out.println(sum(1,4,5));
    }

    public static int sumOfThreeNumbers(int a1, int a2, int a3) {
        return a1 + a2 + a3;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a1, double a2){
        return a1+a2;
    }
    public static String sum(String a, String b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

}
