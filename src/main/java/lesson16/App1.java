package lesson16;

public class App1 {
    public static void main(String[] args) {

        Person anna = new Person();
        try {
             anna = new Person("Anna SI", 12);
        }catch (ArithmeticException err){
            System.out.println("Age is wrong");
        }

        try {
            anna.setAge(123);
        }catch (ArithmeticException err){
            System.out.println("Age is Wrong");
        }

    }
}
