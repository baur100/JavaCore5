package hw12;

public class Car implements SteeringWheel, Wheels {
    private String model;
    private String color;
    private int manufactureYear;
    private int numbersOfSeats;

    public Car(String model, String color, int manufactureYear, int numbersOfSeats) {
        this.model = model;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.numbersOfSeats = numbersOfSeats;
    }

    public String toString() {
        return "Car{" +
                "\nModel='" + model + '\'' +
                ", \ncolor='" + color + '\'' +
                ", \nmanufactureYear=" + manufactureYear +
                ", \nnumbersOfSeats=" + numbersOfSeats +
                '}';
    }

    public void pressHorn(){
        System.out.println("Beeeeeeeeeeeeep");
    }
    public void turnLeft(){
        System.out.println("You are turning left");
    }
    public void turnRight(){
        System.out.println("You are going right");
    }

    public void mustBeRounded() {
        System.out.println("Steering Wheel is rounded ");
    }

    public void mustHaveHorn() {
        System.out.println("You-whoo we can beep");
    }

    public void size() {
        System.out.println("Radius of my wheels is: 22' ");
    }

    public void psi() {
        System.out.println("Pressure in a wheel is 35 psi");
    }
}
