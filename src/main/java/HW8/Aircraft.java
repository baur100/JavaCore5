package HW8;

public class Aircraft {

    private String color;
    private String size;
    private String capacity;
    private int millage;


    public Aircraft(String color, String size, String capacity, int millage) {
        this.color = color;
        this.size = size;
        this.capacity = capacity;
        this.millage = millage;
    }


    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getCapacity() {
        return capacity;
    }

    public int getMillage() {
        return millage;
    }



    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }







    public void printAircraftData (){

        System.out.println("Aircraft{" +
                    "color='" + color + '\'' +
                    ", size='" + size + '\'' +
                    ", capacity='" + capacity + '\'' +
                    ", millage=" + millage +
                    '}');
        }



}
