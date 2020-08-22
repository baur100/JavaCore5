package hw14;

public class NewYork extends UnitedStates{

    public String capital;


    public NewYork(String state, String city, int population, String capital) {
        super(state, city, population);
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void printNyInfo() {
        System.out.println("The Capital of New York is " + capital);
    }
}
