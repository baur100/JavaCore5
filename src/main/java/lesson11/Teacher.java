package lesson11;

import org.w3c.dom.ranges.RangeException;

public class Teacher {
    private String name;
    private String lastname;
    private Address address;
    private int yearOfBirth;
    private Subject majorSubject;

    public Teacher(String name, String lastname, Address address, int yearOfBirth, Subject majorSubject) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
        this.majorSubject = majorSubject;
    }

    public Teacher(String name, String lastname, Address address, int yearOfBirth) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }

    public Teacher(String name, String lastname, Address address) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
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

    public int getYearOfBirth() {
        if(yearOfBirth<1970) {
            throw new RangeException((short)1,"Wrong year of birth-year must be 1971 or greater");
        }
        return yearOfBirth;
    }

    public Subject getMajorSubject() {
        return majorSubject;
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

    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth<1970) {
            throw new RangeException((short)1,"Wrong year of birth-year must be 1971 or greater");
        }
        this.yearOfBirth = yearOfBirth;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address=" + address +
                ", yearOfBirth=" + yearOfBirth +
                ", majorSubject=" + majorSubject +
                '}';
    }
}
