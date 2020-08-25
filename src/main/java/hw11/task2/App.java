package hw11.task2;

public class App {
    public static void main(String[] args) {
        Apple iPhone = new Apple("Apple"," SE", 2020, 128,"14 mpxl");
        Xiaomi mi8 = new Xiaomi( "Mi","8", 2018, 64, 5, "9.0 Kitkat");
        Samsung galaxy = new Samsung("Samsung", "Galaxy S11",2021, 512, 4,"USB-C");

        System.out.println(iPhone + "  Brand is: " + iPhone.getBrand());
        System.out.println(mi8.getAndroidVersion());
        System.out.println(galaxy.getBrand() + " is using " +galaxy.getChargingPort() + " charging port");

    }
}
