package lesson6;

public class A2 {
    public static void main(String[] args) {
     helloToYou("Valentina");
     flights("Hawaii", "Los Angeles");
     flights("Moscow", "Cheboxary");

    }
    public static void helloToYou(String name){
        System.out.println("Hello "+name );
    }
    public static void flights(String from, String to){
        System.out.println("Flight from " + from + " just landed at "  + to + "." );
    }
}
