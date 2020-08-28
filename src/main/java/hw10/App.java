package hw10;

public class App {
    public static void main(String[] args) {
        Person me = new Person("Denis", "Maximov", 36);
        Person wife = new Person("Ksenia", "Avtukhova", 32);

        Car ford = new Car("Ford", "Explorer", 2016, 45000);
        Car escalade = new Car("Cadilac", "Escalade", 2020, 3000);

        System.out.println(escalade.getBrand());

        ford.printInfo();
        me.printInfoPerson();
    }
}
