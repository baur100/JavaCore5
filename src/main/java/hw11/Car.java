package hw11;

import java.util.Arrays;

public class Car extends Vehicle{
    private Colors color;
    private FuelType fuel;
    private Colors[] colors;


    public Car(){}

    public Car(String brand, String name, int year, FuelType fuel) {
        super(brand, name, year);
        this.fuel = fuel;

    }
    public Car(String brand, String name, int year, FuelType fuel, Colors[] colors){
        super(brand, name, year);
        this.fuel = fuel;
        this.colors = colors;
    }
    public Car(FuelType fuel, Colors[] colors){
        this.fuel = fuel;
        this.colors = colors;

    }
//    public Car(String gmc, String sierra, int i, FuelType fuel, Colors colors){
//        setBrand("Audi");
//        setName("S5");
//        setYear(2020);
//        setFuelType(FuelType.HYBRID);
//        setColors(getColors());
//    }
    public void setFuelType(FuelType fuel){
        this.fuel = fuel;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    public void setColor(Colors color){ this.color = color;}

    public Colors[] getColors() {
        return colors;
    }

    public void setColors(Colors[] colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Car" +
                "\nfuel=" + fuel +
                "\ncolors=" + Arrays.toString(colors) +
                "\nbrand='" + brand + '\'' +
                "\nname='" + name + '\'' +
                "\nyear=" + year +
                "\n****************************************";
    }
}
