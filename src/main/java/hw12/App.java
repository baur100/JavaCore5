package hw12;

public class App {
    public static void main(String[] args) {

        Wheels Tractor1 = new Tractor(100, "latest model", "Automatic");
        Tractor1.size();
        Tractor1.psi();

        System.out.println("___________________++++++++++++++++++++++++++++++++__________________________");

        Car HondaCivic = new Car("Civic", "blue", 2012, 7);
        System.out.println(HondaCivic.toString());
        System.out.println("\n******************************************");
        HondaCivic.pressHorn();
        System.out.println("\n******************************************");
        HondaCivic.turnLeft();
        System.out.println("\n******************************************");


        System.out.println("___________________++++++++++++++++++++++++++++++++__________________________");

        Tractor JohnDeer = new Tractor(22590,"TP-90", "Manual");
        JohnDeer.mustBeRounded();
        System.out.println("\n******************************************");
        JohnDeer.mustHaveHorn();
        System.out.println("\n******************************************");
        JohnDeer.psi();
        System.out.println("\n******************************************");
        JohnDeer.size();

    }
}
