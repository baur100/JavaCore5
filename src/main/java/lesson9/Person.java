package lesson9;

public class Person {
    public String name;
    public String lastName;
    public int year;
    public Gender gender;

    public void sayHi(String n){
        System.out.println(name + " Say Hello to "+ n);
    }
}
