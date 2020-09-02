package lesson16;

public class App1 {
    public static void main(String[] args) {
        Person ivan = new Person();
        try {
            ivan = new Person("Ivan Pestov",5);
        } catch (ArithmeticException err){
            System.out.println("Age is wrong");
        }

        try {
            ivan.setAge(125);
        } catch (ArithmeticException err){
            System.out.println("Age is wrong");
        }
    }
}
