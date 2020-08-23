package hw14;

import java.util.HashMap;

public class Rooms {
    private int number;
    private Position position;

    public Rooms(int number, Position position) {
        this.number = number;
        this.position = position;
    }
    public Rooms(){}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "\nRooms" +
                "\nnumber=" + number +
                "\nposition=" + position +
                "*****************************************************";
    }
}
