package lesson10;

public class Person {
    public String name;
    public String lastName;
    public int year;
    public Gender gender;

    public Person(String n, String l, int y, Gender g){
        this.name = n;
        lastName = l;
        year = y;
        gender = g;
    }
    public Person() {}
    public Person(String n, String l, int y){
        this.name = n;
        this.lastName = l;
        this.year = y;
    }
    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

}
