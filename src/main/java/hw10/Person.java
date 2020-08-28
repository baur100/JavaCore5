package hw10;

public class Person {
    public String name;
    public String lastname;
    public int age;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfoPerson() {
        System.out.println ("Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}');
    }
}
