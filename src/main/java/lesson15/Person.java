package lesson15;

public class Person {
    public static void hello(){   // в статических функциях мы моем вызывать только статические функции
        System.out.println("Hello!");
        System.out.println(helpMeStatic());

    }
    public void hi(){
        System.out.println("Hi!");
        System.out.println(helpMe());
    }
    public String helpMe(){
        return "Help me.";
    }
    public static String helpMeStatic(){
        return "Help me STATIC";
    }
}
