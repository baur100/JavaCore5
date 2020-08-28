package lesson10;

public class Person {
    public String name;
    public String lastname;
    public int year;
    public Gender gender;

    public Person(String name, String lastname, int year, Gender gender) {
        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.gender = gender;
    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
}
