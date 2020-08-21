package hw9_10;
//1. Create 4 classes with fields (at least 3 fields) and methods (at least 1 method)
//each class has at least 2 constructors (default and full)
//create printClass()/ printInfo() method to print out all fields
//fields are private
//each field has getter and setter
//2. In the App class create main() and create 2 instanses of each class;
//one instance created used default constructor - fill up fields using setter
//second object created using full constructor
//print object info using print-out method

public class App {

    public static void main(String[] args) {

        City newYork = new City("4665 Bedford Ave", "Kings", 10000, 2000);
        City miami = new City();
        miami.setCounty("Broward");
        miami.setPopulation(5000);
        miami.setRentPrice(1500);
        miami.setStreet("1825 S Ocean Dr");
        miami.printCity();

        Dog myDog = new Dog("Lola", 15, "pug", "beige");
        Dog hisDog = new Dog();
        hisDog.setName("Patric");
        hisDog.setAge(10);
        hisDog.setBreed("Frenchie");
        hisDog.setColor("black");
        myDog.printDog();

        Food favFood = new Food("Mango", "Tomato", "Chicken", "Tiramisu");
        Food justFood = new Food();
        justFood.setFruits("Apple");
        justFood.setMeat("Beef");
        justFood.setSweets("Buns");
        justFood.setVegetables("Cucumber");
        justFood.printFood();

        Person man = new Person("Vlad", 25, 85, "Green");
        Person woman = new Person();
        woman.setName("Lana");
        woman.setAge(25);
        woman.setEyeColor("Black");
        woman.setWeight(55);
        woman.printPerson();

    }
}
