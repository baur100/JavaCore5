package hw11;

import java.util.Arrays;

public class Plane extends Car{

    public Plane(String brand, String name, int year, FuelType fuel) {
        super(brand, name, year, fuel);
    }
    public Plane(){}



    @Override
    public String toString() {
        return "Plane" +
                "\nbrand='" + brand + '\'' +
                "\nname='" + name + '\'' +
                "\nyear=" + year +
                "\n*********************************";
    }
}
