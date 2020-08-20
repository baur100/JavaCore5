package homework10;

public class App {
    public static void main(String[] args) {
        Cellphone iphone = new Cellphone("iPhone", "X", "retina", 4, 128);
        Cellphone samsung = new Cellphone();

        samsung.setBrand ("Samsung");
        samsung.setDisplay("OLED");
        samsung.setMemory(64);
        samsung.setModel("Galaxy S10");
        samsung.setRAM(6);

        iphone.printCellphone();
        samsung.printCellphone();


        CivilPlane airbus = new CivilPlane("Airbus", "A320", 250, 10000 );

        CivilPlane boeing = new CivilPlane();
        boeing.setBrand("Boeing");
        boeing.setModel("727");
        boeing.setDistance_of_flight(11000);
        boeing.setNumber_of_passengers(260);

        airbus.printPlane();
        boeing.printPlane();

        Country usa = new Country("United States of America", "USA", 320000000, "Democracy");
        Resources[] resourcesUS = {Resources.GOLD, Resources.LAND, Resources.OIL};
        usa.setMain_resourсes(resourcesUS);
        usa.countryInfo();

        Country china = new Country("People's Republic of China", "PRC", 1500000000, "Communism");
        Resources[] resourcesCH = {Resources.LAND, Resources.GAS, Resources.WOOD, Resources.TITANIUM, Resources.PLATINUM};
        china.setMain_resourсes(resourcesCH);
        china.countryInfo();

    }


}
