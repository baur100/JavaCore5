package hw15;

public class App {
    public static void main(String[] args) {
        Lion african = new Lion("Simba");
        Lion siberian = new Lion("Lulu");
        Bear tayga = new Bear("Balu");

        tayga.breathe();
        tayga.breed();
        tayga.death();
        siberian.breathe();
        siberian.death();
        siberian.breed();

    }
}
