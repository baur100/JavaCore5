package lesson9;

public class Car {
    public String brand;
    public String model;
    public int year;

    public void drive(){
        System.out.println("I "+brand+", "+model+", "+year);
    };

    public void beep(){
        System.out.println(brand+" be-be");
    }
}
