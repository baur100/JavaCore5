package lesson6;

public class AppA {
    public static void main(String[] args) {
        helloToYou("Alena");
        helloToYou("Alina");
        helloToYou("Anna");

        trip("New York","Moscow");
        trip("Sydney","Los Angeles");

    }

    public static void helloToYou(String name){
        System.out.println("Hello "+ name);
    }

    public static void trip(String city1, String city2){
        System.out.println("trip from "+city1+" just landed at "+city2);
    }
}
