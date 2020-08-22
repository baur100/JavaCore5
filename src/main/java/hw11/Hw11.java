package hw11;

import java.awt.*;

public class Hw11 {

    public static void main(String[] args) {


        Colors[] colors = {Colors.WHITE,Colors.BLACK,Colors.RED,Colors.YELLOW,Colors.BLUE};

        Car Audi = new Car("Audi", "S5", 2018,FuelType.HYBRID, colors);
        Audi.getColors();
        System.out.println(Audi.toString());

        Car GMC = new Car();
        GMC.setBrand("GMC");
        GMC.setName("Sierra");
        GMC.setFuelType(FuelType.GAS);
        GMC.setColor(Colors.BLACK);
        System.out.println(GMC.toString());

        Plane Airbus = new Plane("Airbus","425",2020,FuelType.DIESEL,colors,"Can fly");
        Airbus.getBrand();
        Airbus.getName();
        Airbus.getYear();
        Airbus.getFuel();
        Airbus.getColors();
        Airbus.getFly();
        System.out.println(Airbus.toString());


        Bicycle Bike = new Bicycle("Strinx","Equinox",2020,FuelType.ELECTRIC,colors,"","");
        Bike.setBike("Has 2 weels");
        System.out.println(Bike.toString());

    }

}
