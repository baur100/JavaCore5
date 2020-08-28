package lesson10;

public class App {
    public static void main(String[] args) {
        Person ksenia = new Person("Ksenia","Avtukhova",1988,Gender.FEMALE);
        Person denis = new Person("Denis","Maximov");

        Student fedor = new Student("Fedor","Petrov","MIT");
        fedor.printInfo();
        System.out.println(fedor.getName());
        fedor.setName("Gosha");
        System.out.println(fedor.getName());

    }
}
