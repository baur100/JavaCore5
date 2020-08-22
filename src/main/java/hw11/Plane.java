package hw11;

import java.util.Arrays;

public class Plane extends Car{
    private String fly;

    public Plane(){}

    public Plane(String brand, String name, int year, FuelType fuel, Colors[] colors){}

    public Plane(String brand, String name, int year, FuelType fuel, Colors[] colors, String fly) {
        super(brand, name, year, fuel, colors);
        this.fly = fly;
    }

    public Plane(String brand, String name, int year, FuelType fuel){}

    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }

    @Override
    public String toString() {
        return "Plane " +
                "\nfly='" + fly + '\'' +
                "\nbrand='" + brand + '\'' +
                "\nname='" + name + '\'' +
                "\nyear=" + year +
                "\n********************************";
    }
}
