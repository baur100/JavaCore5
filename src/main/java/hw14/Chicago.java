package hw14;

public class Chicago extends UnitedStates {

    public String capital;

    public Chicago(String state, String city, int population, String capital) {
        super(state, city, population);
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void printChicagoInfo() {
        System.out.println("Chicago's capital: " + capital + "\nPopulation is " + population);
    }
}
