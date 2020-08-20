package hw11;

import java.util.Arrays;

public class Car extends Vehicle{
    private FuelType fuel;

    public Car(String brand, String name, int year, FuelType fuel) {
        super(brand, name, year);
        this.fuel = fuel;

    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
