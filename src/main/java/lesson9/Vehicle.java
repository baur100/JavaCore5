package lesson9;

public class Vehicle {
    public String brand;
    public String model;
    public int year;
    public Colors color;

    public void drive(){
        System.out.println("I "+brand+" "+ model+ " "+year + " can drive!!!");
    }
    public void beep(){
        System.out.println(model + " beeping");
    }
}
