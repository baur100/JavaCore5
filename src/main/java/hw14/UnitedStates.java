package hw14;

public class UnitedStates {

    public String state;
    public String city;
    public int population;

    public UnitedStates(String state, String city, int population) {
        this.state = state;
        this.city = city;
        this.population = population;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
