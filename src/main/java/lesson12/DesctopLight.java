package lesson12;

public class DesctopLight implements AmericanPowerSocket,InternationalBulbSocket {
    private String Brand;
    private String model;
    private int price;

    public DesctopLight(String brand, String model, int price) {
        Brand = brand;
        this.model = model;
        this.price = price;
    }
    public void switchOn(){
        System.out.println("Switched ON");
    }
public void SwitchOf(){
        System.out.println("Switched OFF");
}
    @Override
    public String toString() {
        return "DesctopLight{" +
                "Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void contacts2() {
        System.out.println("I have two contacts");

    }

    @Override
    public void mustBeFlat() {
        System.out.println("Contacts are flat");
    }

    @Override
    public void bulbStandart() {
        System.out.println("Bulb socket implemented"); //Имплементировать- дать тело которое будем использовать

    }
}
