package Lesson11;

import org.w3c.dom.ranges.RangeException;

public class Person {
    protected String name;
    protected String lastName;
    protected Address address;
    protected int yearOfBirth;

    public Person(String name, String lastName, Address address, int yearOfBirth) {
        if (yearOfBirth < 1980) {
            throw new RangeException((short) 404, "Cant attend our school due to the age - Year of birth must be 1998 or greater");
        }
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
            if(yearOfBirth <1980) {
                throw new RangeException((short) 404, "Cant attend our school due to the age - Year of birth must be 1998 or greater");
            }
            this.yearOfBirth = yearOfBirth;
    }
}
