package Lesson9;

public class Person {
    public String name;
    public String lastName;
    public int year;
    public Gender gender;

    public void calls(String n){
        System.out.println(name + " calls Jeff's phone");
    }
    public void sayHi(String n){
        System.out.println(name + " says hello to "+ n);
    }
    public void says(String n){
        System.out.println(name + " ask's Jeff "+ n);
    }
    public void dialing(String n){
        System.out.println(name + " dialing MacKenzi");
    }


}
