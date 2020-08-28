package hw10;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int millege;

    public Car(String brand, String model, int year, int millege) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.millege = millege;
    }
    public Car (){}

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public int getMillege() {
        return millege;
    }

    public void setMillege(int millege) {
        this.millege = millege;
    }

    public void printInfo(){
        System.out.println(brand +" "+ model+" "+millege);
    }
}
