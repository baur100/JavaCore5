package hw11;

import java.util.Arrays;

public class Bicycle extends Plane{
    private String bike;

    public Bicycle(){}


    public Bicycle(String brand, String name, int year, FuelType fuel, Colors[] colors, String fly,String bike) {
        super(brand, name, year, fuel, colors);
        this.bike = bike;
    }

    public String getBike() {
        return bike;
    }

    public void setBike(String bike) {
        this.bike = bike;
    }

    @Override
    public String toString() {
        return "Bicycle" +
                "\nbike='" + bike + '\'' +
                "\nbrand='" + brand + '\'' +
                "\nname='" + name + '\'' +
                "\nyear=" + year +
                "\n************************************";
    }
}
