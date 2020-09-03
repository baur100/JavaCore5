package lesson15;

public class Person {
    private int x=5;
    public static int y= 5;
    public static void hello(){
        System.out.println("Hello" +y);
        System.out.println(helpMeStatic());
    }
    public void hi(){
        System.out.println("hi"+y+x);
        System.out.println(helpMe());
        System.out.println(helpMeStatic());
    }

    public String helpMe(){
        return "helpMe";
    }
    public static String helpMeStatic(){
        return "helpMeStatic";
    }
}
