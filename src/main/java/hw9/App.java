package hw9;

public class App {
    public static void main(String[] args) {
        Pet myPet = new Pet();

        myPet.dogName = "Chakki";
        myPet.dogBreed = "Mastiff";
        myPet.color = "Brown";
        myPet.year = 5;

        System.out.println("---------------------------------");

        myPet.sayWoof();
        myPet.Woof();

        System.out.println("---------------------------------");

        Laptop myLaptop = new Laptop();

        myLaptop.model = "Acer";
        myLaptop.color = "Silver";
        myLaptop.year = 2012;
        myLaptop.os = "Windows";
        myLaptop.version = 7;

        myLaptop.myLaptop();
        System.out.println("---------------------------------");

        Phone Samsung = new Phone();
        Samsung.make = "Samsung";
        Samsung.model = "Galaxy S";
        Samsung.version = 10;
        Samsung.os = "Android";
        Samsung.voiceSearch = "Google";

        Samsung.myPhoneInfo();
        Samsung.callMyWife();

    }
}
