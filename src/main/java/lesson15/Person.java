package lesson15;

public class Person {
    private int x=5;
    public static int y=5; //сттические методы переменных можно вызывать с обоих
    public static void hello(){
        System.out.println("Hello"+y);
        System.out.println(helpmestatic());
    }
    public void hi(){
        System.out.println("Hi"+y+x);
        System.out.println(helpme());
    }

    public String helpme(){
        return "helpME";
    }
    public static  String helpmestatic(){   // static only static method
        return "helpmestatic";
    }
}
