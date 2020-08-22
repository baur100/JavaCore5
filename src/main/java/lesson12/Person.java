package lesson12;

import lesson11.Address;

public abstract class Person {
    protected String name;
    protected String lastName;
    protected Address address;
    protected int yearOfBirth;

    public Person(){}
    public Person(String name, String lastName, Address address, int yearOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }
}
