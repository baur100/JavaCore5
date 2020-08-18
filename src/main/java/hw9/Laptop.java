package hw9;

public class Laptop {
    public String model;
    public String os;
    public String color;
    public int version;
    public int year;

    public void myLaptop() {
        System.out.println("My lovely laptop - " + color + " " + "'" + model + "'");
        System.out.println("1. " + "Open laptop");
        System.out.println("2. " + "Press power button, and turn on");
        System.out.println("...Starting..." + os + " " + version);
    }

}
