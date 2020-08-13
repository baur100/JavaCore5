package work;

public class work5 {
    public static void main(String[] args) {
        helloToYou("Alena");
        helloToYou("Alina");
        helloToYou("Anna");

        trip("New York", "Moscow");
        trip("Sydney", "Los Angeles");

    }

    public static void helloToYou(String name) {
        System.out.println("Hello, " + name);
    }

    public static void trip(String from, String to) {
        System.out.println("Trip from " + from + " just landed at " + to);
    }
}
