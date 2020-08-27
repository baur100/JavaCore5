package lesson11;

import java.util.Arrays;

public class Student extends Person{
    private Subjects[] subjects;
    private Subjects major;

    public Student(String name, String lastName, Address address, Subjects[] subjects, int yearOfBirth, Subjects major) {
        super(name,lastName,address,yearOfBirth);
        this.subjects = subjects;
        this.major = major;
    }


    public Subjects[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects[] subjects) {
        this.subjects = subjects;
    }

    public Subjects getMajor() {
        return major;
    }

    public void setMajor(Subjects major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", subjects=" + Arrays.toString(subjects) +
                ", yearOfBirth=" + yearOfBirth +
                ", major=" + major +
                '}';
    }
    public void printStudent() {
        System.out.println("+++Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", subjects=" + Arrays.toString(subjects) +
                ", yearOfBirth=" + yearOfBirth +
                ", major=" + major +
                '}');
    }
}
