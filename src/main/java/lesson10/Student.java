package lesson10;

public class Student {
    private String name;
    private String lastname;
    private String college;

    public Student(String name, String lastname, String college) {
        this.name = name;
        this.lastname = lastname;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCollege() {
        return college;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void printInfo(){
        System.out.println ("Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", college='" + college + '\'' +
                '}');
    }
}
