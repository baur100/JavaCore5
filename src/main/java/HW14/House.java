package HW14;

public class House {

    private String color;
    protected int floors;
    protected String location;


    public House(String color, int floors, String location) {
        this.color = color;
        this.floors = floors;
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public int getFloors() {
        return floors;
    }

    public String getLocation() {
        return location;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", floors=" + floors +
                ", location='" + location + '\'' +
                '}';
    }
}
