package work15;
public class Person {
    private int x = 5;
    public static  int y = 5;
    public static void hello(){

            System.out.println("Hello");

    }
    public void hi(){
        System.out.println("hi");
        System.out.println(helpMe());
    }
    public String helpMe(){
        return"helpMe";
    }
    public static String helpMeStatic(){
        return "helpMeStatic";
    }
}
