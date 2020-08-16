package HW8;

public class Car {

    private String model;
    private int year;
    private String color;
    private int millage;


    public Car(String model, int year, String color, int millage) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.millage = millage;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getMillage() {
        return millage;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }



    public void printCarInfo() {

        System.out.println("Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", millage=" + millage +
                '}');

    }


}