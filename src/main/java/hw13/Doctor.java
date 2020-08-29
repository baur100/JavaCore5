package hw13;

import java.util.Arrays;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;

    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public String toString() {
        return "Doctor: " + "\n" +
                name + " " + lastName +
                ", " + position + ".";
    }
}

