package hw810;

public class Friends {
    public String name;
    public Gender gender;
    public int year;


    public void aboutYourself(){
        System.out.println("Hi! My name is "+ name + ". i am a "+ gender + ". i was born in " + year);
    }
    public void happyToSee (String sayName) {
        System.out.println("I am " + name + ". I am so happy to see you, "+ sayName);
    }

}
