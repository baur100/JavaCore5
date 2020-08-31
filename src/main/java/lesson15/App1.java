package lesson15;

public class App1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.hi();
        Person.hello();   //static method only for CLASS не надо создавать объект
        System.out.println( );

        Person p2 = new Person();
        p2.hi();
        Person.y =20;
        p2.hi();
        person.hi();
    }
}
