package lesson11;

import org.w3c.dom.ranges.RangeException;

public class Person {
    protected String name;
    protected String lastName;
    protected Address address;
    protected int yearOfBirth;

    public Person(String name, String lastName, Address address, int yearOfBirth) {
        if(yearOfBirth <1970){
            throw new RangeException((short) 1, "Wrong year of birth - year must be 1971 or greater");
        }
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }
    public void sayHello(){
        System.out.println("Hello");
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
        if(yearOfBirth <1970){
            throw new RangeException((short) 1, "Wrong year of birth - year must be 1971 or greater");
        }
        this.yearOfBirth = yearOfBirth;
    }
}
