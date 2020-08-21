package Lesson9;

public class Phone {
    public String brand;
    public String model;
    public int year;

    public void talk() {
        System.out.println("I'm an " + brand + " " + model + " " + year + " can help you talk to people using this device!!");

    }
    public void ring() {
        System.out.println(model + " is ringing");

    }
    public void call(){
        System.out.println(model + " is calling");
    }
     }