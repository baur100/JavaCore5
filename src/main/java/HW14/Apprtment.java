package HW14;

public class Apprtment extends Condo {


     private String floor;

    public Apprtment(String color, int floors, String location, int[] parkingNumbers, String floor) {
        super(color, floors, location, parkingNumbers);
        this.floor = floor;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}
