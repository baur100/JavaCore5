package hw11;

public class Part1 {
    public static void main(String[] args) {
        Oceans[] oceans = {Oceans.ARCTIC, Oceans.ATLANTIC, Oceans.INDIAN, Oceans.PACIFIC};
        Continents[] continents = {Continents.AFRICA, Continents.ANTARCTICA, Continents.AUSTRALIA, Continents.EURASIA, Continents.NORTH_AMRICA, Continents.SOUTH_AMERICA};
        Planet planet1 = new Planet("Earth", 230000, continents, 6, oceans, 4);
        planet1.infoPlanet();

        Continent continent1 = new Continent("Earth", 196.9, 5349, Continents.EURASIA, 53, "biggest");
        System.out.println(continent1);

        Country country1 = new Country("Earth", 196.9, Continents.NORTH_AMRICA, 9, "USA", 50, 331.2);
        System.out.println("========GETTERS========");
        country1.getCountry();
        country1.getCitizen();
        country1.getState();
        country1.getContinent();
        country1.getSqc();
        country1.getName();
        country1.getSq();
        System.out.println("Country: " + country1.getCountry());
        System.out.println("Amount citizens:" + country1.getCitizen());
        System.out.println("Amount states: " + country1.getState());
        System.out.println("Continent: " + country1.getContinent());
        System.out.println("Square of continent: " + country1.getSqc());
        System.out.println("Name of planet: " + country1.getName());
        System.out.println("Square of ground on planet: " + country1.getSq());

    }
}
