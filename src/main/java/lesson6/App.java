package lesson6;

public class App {
    public static void main(String[] args) {
        hello();
        hello();
        hello();

        hi();
        hi();
        hi();
        hi();

        hello();
    }

    public static void hello(){
        System.out.println("Hello, my friend");
        System.out.println("Today is a beautiful weather");
    }

    public static void hi(){
        hello();
        System.out.println("Hi - Hi - Hi");
    }
}
