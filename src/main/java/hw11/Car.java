package hw11;

public class Car extends Dashboard {
    private String make;
    private String model;
    private int year;
    private String color;
    private String startEngine;

    public Car(String on, String off, String make, String model, int year, String color, String startEngine) {
        super(on, off);
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.startEngine = startEngine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStartEngine() {
        return startEngine;
    }

    public void setStartEngine(String startEngine) {
        this.startEngine = startEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", startEngine='" + startEngine + '\'' +
                ", on='" + on + '\'' +
                ", off='" + off + '\'' +
                '}';
    }
}
