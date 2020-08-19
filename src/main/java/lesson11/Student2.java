package lesson11;

public class Student2 extends Student{
    private Subjects major2;
    public Student2(String name, String lastName, Address address, Subjects[] subjects, int yearOfBirth, Subjects major, Subjects major2) {
        super(name, lastName, address, subjects, yearOfBirth, major);
        this.major2 = major2;
    }
}
