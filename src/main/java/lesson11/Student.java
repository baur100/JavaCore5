package lesson11;

import org.w3c.dom.ranges.RangeException;

import java.util.Arrays;

public class Student {
    private String name;
    private String lastname;
    private Address address;  //Объекты могут состоять из других объектов
    private Subject[] subjects;
    private int yearOfBirth;
    private Subject major;

    public Student(String name, String lastname, Address address, Subject[] subjects, int yearOfBirth, Subject major) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.subjects = subjects;
        this.yearOfBirth = yearOfBirth;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Address getAddress() {
        return address;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Subject getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth<1970){
            throw new RangeException((short)1,"Wrong year of birth-year must be 1971 or greater");
        }
        this.yearOfBirth = yearOfBirth;
    }

    public void setMajor(Subject major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address=" + address +
                ", subjects=" + Arrays.toString(subjects) +
                ", yearOfBirth=" + yearOfBirth +
                ", major=" + major +
                '}';
    }
}
