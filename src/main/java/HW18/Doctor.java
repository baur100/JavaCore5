package HW18;

public class Doctor {


    private String name;
    private String lastName;
    private Position position;


    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                '}';
    }
}
