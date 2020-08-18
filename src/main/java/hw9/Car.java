package hw9;

public class Car {
    public String Model;
    public String Color;
    public int Millage;
    public int Year;
    public String NewColor;

    public void printCar(){
        System.out.println(Model + " is manufactured in " + Year + ", originally color was "
                + Color + " but after remodeling it's become " + NewColor);
    }
    public void runCar() {
        System.out.println("Current odometer in your " + Model + " is: " + Millage + " miles");
    }
}
