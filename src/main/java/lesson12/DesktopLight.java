package lesson12;

public class DesktopLight implements AmericanPowerSocket, InternationalBulbSocket{
    private String brand;
    private String model;
    private int price;

    public DesktopLight(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void switchOn(){
        System.out.println("Switched ON");
    }
    public void switchOff(){
        System.out.println("Switched OFF");
    }

    @Override
    public String toString() {
        return "DesktopLight{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public void contacts2() {
        System.out.println("I have two contacts");
    }

    public void mustBeFlat() {
        System.out.println("Contacts are flat");
    }

    public void bulbStandard() {
        System.out.println("Bulb socket implemented");
    }

}
