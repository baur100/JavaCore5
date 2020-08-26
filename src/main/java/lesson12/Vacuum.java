package lesson12;

public class Vacuum implements AmericanPowerSocket{
    private String brand;
    private String model;
    private int power;
    private int suckingPower;

    public Vacuum(String brand, String model, int power, int suckingPower) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.suckingPower = suckingPower;
    }

    public void startSuckingDust(){
        System.out.println("Home is clean now");
    }

    public void contacts2() {
        System.out.println("This vacuum has 2 contacts");
    }

    public void mustBeFlat() {
        System.out.println("My contacts are flat");
    }
}
