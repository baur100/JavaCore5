package lesson14;

public class App {
    public static void main(String[] args) {
        Tickets berlin = new Tickets(1000);
        System.out.println(berlin.getPrice(1));
    }
}
