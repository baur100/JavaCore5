package Lesson11;

import java.util.Arrays;

public class Student extends Person {
    private Subjects major;
    private Subjects[] subjects;

    public Student(String name, String lastName, Address address, int yearOfBirth,Subjects major, Subjects[] subjects) {
        super(name,lastName,address,yearOfBirth);
        this.major = major;
        this.subjects = subjects;
    }


    public Subjects getMajor() {
        return major;
    }

    public void setMajor(Subjects major) {
        this.major = major;
    }

    public Subjects[] getSubjects(Student vlad) {
        return subjects;
    }

    public void setSubjects(Subjects[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address=" + address +
                ", major=" + major +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
