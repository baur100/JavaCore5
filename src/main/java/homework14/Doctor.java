package homework14;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;

    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public Doctor() {
    }

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

    @Override
    public String toString() {
        return "\n        "+
                "\nDOCTOR:" +
                "\nName: " + name +
                "\nLast name: " + lastName +
                "\nPosition: " + position+
                "\n_______________________";
    }

    public void printDoctors() {
        System.out.println(
                "\nName is " + name +
                "\nLast name is " + lastName +
                "\nPosition is " + position+
                "\n_________________________");


    }
}
