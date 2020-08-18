package lesson10;

public class Person {
    public String name;
    public String lastname;
    public int year;
    public Gender gender;


    public Person(String n, String l, int y, Gender g) {
        name = n;
        lastname = l;
        year = y;
        gender = g;
    }

    public Person() {
    }
    public Person(String n,String l,int y){
        this.name=n;
        this.lastname=l;
        this.year=y;
    }
    public Person(String name, String lastname){
        this.name=name;
        this.lastname=lastname;
    }
}
