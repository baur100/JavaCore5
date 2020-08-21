package hw11;

import java.util.Arrays;

abstract class Vehicle {
    protected String brand;
    protected String name;
    protected int year;


    public Vehicle(String brand, String name, int year){
        this.brand = brand;
        this.name = name;
        this.year = year;

    }
    public Vehicle(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle" +
                "\nbrand='" + brand + '\'' +
                "\nname='" + name + '\'' +
                "\nyear=" + year +
                "\n********************************";
    }
}
