package lesson16;

public class Part3 {
    public static void main(String[] args) {
        try {
            checkAge(30);
            System.out.println("Age is legal!");
        } catch (IllegalAccessException e) {
            System.out.println( "Age is illegal tu buy doze");
        }
    }                                 //сигнатура функции
    public static boolean checkAge(int age) throws IllegalAccessException{
        if(age<21){
            throw new IllegalAccessException("!!!Wrong age");
        }
        return true;
    }
}
