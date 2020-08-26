package lesson15;

public class App1 {
    public static void main(String[] args) {

        Person person = new Person();
//        person.hi();
//
//        Person.hello();


        Person p2 = new Person();

        p2.hi();
        Person.y=20;

        p2.hi();
        person.hi();
    }
}
