package hw11;

public class Hw11 {

    public static void main(String[] args) {


        Colors[] colors = {Colors.WHITE,Colors.BLACK,Colors.RED,Colors.YELLOW,Colors.BLUE};

        Car Audi = new Car("Audi", "S5", 2018,FuelType.HYBRID,Colors.BLUE);
        Audi.getColors();
        System.out.println(Audi.toString());

        Plane Airbus = new Plane("Airbus","425",2015,FuelType.GAS);
        System.out.println(Airbus.toString());


        Bicycle Bike = new Bicycle("Strinx","Equinox",2020,FuelType.ELECTRIC);
        System.out.println(Bike.toString());

    }

}
