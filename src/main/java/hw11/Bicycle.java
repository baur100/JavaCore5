package hw11;

import java.util.Arrays;

public class Bicycle extends Plane{

    public Bicycle(String brand, String name, int year,FuelType fuel) {
        super(brand, name, year, fuel);
    }

    @Override
    public String toString() {
        return "Bicycle: " +
                "\nbrand='" + brand + '\'' +
                "\nname='" + name + '\'' +
                "\nyear=" + year +
                "\n**********************************";
    }
}
