package lesson9;

public class Person {
    public String name;
    public String lastname;
    public int year;
    public Gender gender;


    public void sayHi(String n){
        System.out.println(name+ " says: Hello, my dear," + n+"!");
    }
}
