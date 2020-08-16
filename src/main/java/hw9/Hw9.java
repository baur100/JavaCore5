package hw9;

public class Hw9 {
    public static void main(String[] args) {

        Company N1 = new Company();
        N1.name = "Google";
        N1.year = 1998;
        N1.founder = "Larry Page";
        N1.emploees = 114000;
        N1.adress = "Menlo Park, CA";

        N1.printCompanyInfo();

        System.out.println("==================================");


        Company N2 = new Company();
        N2.name = "Netflix";
        N2.year = 1997;
        N2.founder = " Reed Hastings and Marc Randolph";
        N2.emploees = 90000;
        N2.adress = "Scotts Valey, CA";

        N2.printCompanyInfo();

        System.out.println("=====================================");

        Bike Superbike = new Bike();
            Superbike.brand = "Harley Davidson";
            Superbike.model = "Street 500";
            Superbike.color = "Black";
            Superbike.type = "Gas";
            Superbike.year = 2019;

            Superbike.PrintBikeInfo();
        System.out.println("-------------------------------------");
            Superbike.drive();
        System.out.println("=====================================");


        Beer MyBeer = new Beer();
        MyBeer.company = "Chimay Premiere";
        MyBeer.name = "CHIMAY Grand Reserve";
        MyBeer.type = Type.ALE;
        MyBeer.age = 5;

        MyBeer.PrintBeerInfo();
        System.out.println("----------------------------------------");
        MyBeer.LoveBeer();

        }

    }

