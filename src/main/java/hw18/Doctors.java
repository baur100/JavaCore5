package hw18;

public class Doctors {
    private String name;
    private String lastname;
    private Position position;

    public Doctors(String name, String lastname, Position position) {
        this.name = name;
        this.lastname = lastname;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    public void printInfoDoctors(){
        System.out.println(position+" "+ lastname+" "+ name);
    }

}

