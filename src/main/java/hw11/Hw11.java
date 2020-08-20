package hw11;

public class Hw11 {

    public static void main(String[] args) {
        Vehicle GeneralVehicle = new Car("GMC","Sierra",2020,FuelType.GAS);
        GeneralVehicle.setYear(2019);
        System.out.println(GeneralVehicle);

        Vehicle Audi = new Car("Audi", "S5", 2018,FuelType.HYBRID);
        System.out.println(Audi);

        System.out.println("===========================================================");

        Vehicle Airbus = new Plane("Airbus","425",2015,FuelType.GAS);
        System.out.println(Airbus);

        System.out.println("==============================================================");

        Vehicle Bike = new Bicycle("Strinx","Equinox",2020,FuelType.ELECTRIC);
        System.out.println(Bike);

    }

}
