package hw13;

public class Doctors {
    private String name;
    private String lastName;
    private Position position;


//GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    //CONSTRUCTION
    public Doctors(){}
    public Doctors(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public Doctors(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Doctors(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String toString() {
        String separator = System.getProperty("line.separator");
        return "Doctor:" +
                "name- " + name +
                ", lastName-" + lastName +
                ", position-" + position+"."+separator;
    }
}
