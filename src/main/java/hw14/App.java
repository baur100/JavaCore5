package hw14;
//1. Create a super class and 3 child classes
//create 2 object of each class (including superclass - don't make it abstract)

public class App {

    public static void main(String[] args) {


        Chicago chicago = new Chicago("Illinois", "Chicago", 10000, "Chicago");
        chicago.printChicagoInfo();

        Miami miami = new Miami("Florida", "Miami", 5000, 1500);
        miami.printMiamiInfo();

        NewYork ny = new NewYork("New York", "New York", 10000, "Albany");
        ny.printNyInfo();

        UnitedStates us = new UnitedStates("Fl", "Tampa", 7000);

    }
}
