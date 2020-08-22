package lesson9;

public class App {
    public static void main(String[] args) {

        Vehicle myCar = new Vehicle();

        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2015;
        myCar.color = Colors.WHITE;


        myCar.drive();

        Vehicle michaeksCar = new Vehicle();
        michaeksCar.brand = "Honda";
        michaeksCar.year = 2019;
        michaeksCar.model = "Civic";
        michaeksCar.color= Colors.GOLD;

        michaeksCar.drive();


        myCar.beep();
        michaeksCar.beep();


        Person john = new Person();
        john.name = "John";
        john.lastName = "Hopkins";
        john.year = 1985;
        john.gender = Gender.MALE;

        Person mary = new Person();
        mary.name = "Mary";
        mary.lastName="Erikson";
        mary.gender = Gender.FEMALE;
        mary.year = 1989;

        john.sayHi("Mary");
        john.sayHi("Jack");
        mary.sayHi("John");

        Person p1 = john;


        System.out.println(myCar.brand + myCar.color + myCar.model + myCar.year);


    }
}
