package hw8;

import java.util.Scanner;

public class Hw8 {
    public static void main(String[] args) {
        CarType Honda_Accord = CarType.Sedan;
        CarType Dodge_RAM = CarType.Truck;
        CarType RangeRover = CarType.SUV;
        CarType MercedesBenz_Sprinter = CarType.Van;
        CarType Honda_Odyssey = CarType.Minivan;
        CarType Ford_Mustang = CarType.Coupe;

        System.out.println(Ford_Mustang + " " + Honda_Accord + " " +  RangeRover + " " +  Dodge_RAM +
                " " +Honda_Odyssey  + " " +   MercedesBenz_Sprinter);

        System.out.println("\n--------------------------------------------------\n");

        CarType[] Cars = {CarType.Coupe, CarType.Sedan,CarType.SUV, CarType.Truck, CarType.Minivan, CarType.Van};
            for (CarType v : Cars){
                System.out.println(v);
             }

        System.out.println("\n--------------------------------------------------\n");

        Transportation Subway = Transportation.byRail;
        Transportation Bike = Transportation.byRoad;
        Transportation Car = Transportation.byRoad;
        Transportation Deltaplane = Transportation.byAir;

        System.out.println("Deltaplane is type of transportation " + Deltaplane);
        System.out.println("Toyota Corolla is type of transportation " + Car);
        System.out.println("Bike is type of transportation " + Bike);
        System.out.println("Subway is type of transportation " + Subway);

        System.out.println("\n--------------------------------------------------\n");

        QA_Engineer jr = QA_Engineer.Junior;
        QA_Engineer md = QA_Engineer.Middle;
        QA_Engineer sr = QA_Engineer.Senior;
        QA_Engineer sdet = QA_Engineer.SDET;
        QA_Engineer pr = QA_Engineer.Principal;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your income before taxes to determine your QA level: ");
        int currentIncome = scan.nextInt();

        if (currentIncome > 150000) {
            System.out.println("You are " + pr + " Quality Assurance Engineer");
            } else if (currentIncome > 120000) {
                System.out.println("You are " + sdet + " Quality Assurance Engineer");
                    } else if (currentIncome > 85000) {
                        System.out.println("You are " + sr + " Quality Assurance Engineer");
                            }else if (currentIncome > 65000) {
                               System.out.println("You are " + sdet + " Quality Assurance Analyst");
                                     } else if (currentIncome < 65000) {
                                         System.out.println("You are " + jr + " Quality Assurance Analyst");
        }
    }

}
