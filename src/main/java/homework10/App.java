package homework10;

public class App {
    public static void main(String[] args) {
        Cellphone iphone = new Cellphone("iPhone", "X", "retina", 4, 128);
        Cellphone samsung = new Cellphone();

        samsung.setBrand("Samsung");
        samsung.setDisplay("OLED");
        samsung.setMemory(64);
        samsung.setModel("Galaxy S10");
        samsung.setRAM(6);

        iphone.printCellphone();
        samsung.printCellphone();


        CivilPlane airbus = new CivilPlane("Airbus", "A320", 250, 10000);

        CivilPlane boeing = new CivilPlane();
        boeing.setBrand("Boeing");
        boeing.setModel("727");
        boeing.setDistance_of_flight(11000);
        boeing.setNumber_of_passengers(260);

        airbus.printPlane();
        boeing.printPlane();


        Resources[] resourcesUS = {Resources.GOLD, Resources.LAND, Resources.OIL};
        Country usa = new Country("United States of America", "USA", 320000000, "Democracy", resourcesUS);
        usa.setMain_resources(resourcesUS);
        usa.countryInfo();

        Resources[] resourcesCH = {Resources.PLATINUM, Resources.GAS, Resources.ALUMINUM, Resources.SILVER};
        Country china = new Country();
        china.setFull_name("People's Republic of China");
        china.setAbbreviation("PRC");
        china.setPolitical_system("Communism");
        china.setPopulation(1500000000);
        china.setMain_resources(resourcesCH);

        china.countryInfo();

    }


}
