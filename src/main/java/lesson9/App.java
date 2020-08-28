package lesson9;

public class App {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.brand = "Ford";
        mycar.model = "Explorer";
        mycar.year = 2016;

        mycar.drive();

        Car mikecar = new Car();
        mikecar.year = 2009;
        mikecar.brand = "Fiat";
        mikecar.model = "x1";

        mikecar.drive();
        mikecar.beep();

        Person jonh = new Person();
        jonh.name = "Anna";
        jonh.lastname = "Karo";
        jonh.gender = Gender.FEMALE;
        jonh.year = 1990;

        Person mary = new Person();
        mary.name = "Mary";
        mary.lastname = "Lola";
        mary.gender = Gender.MALE;
        mary.year = 1988;

        jonh.sayHi("Mary");
        mary.sayHi(jonh.name);
        jonh.sayHi("lola");

        House ob277 = new House();
        ob277.address = "5738 fair ave";
        ob277.bathrooms = 2;
        ob277.bedrooms = 3;
        ob277.sq = 2000;
        ob277.price = 450000;
        ob277.year = 2001;

        ob277.printInfoHouse();

    }
}
