package hw11;

import java.util.Arrays;

public class Country extends Continent {
    private String country;
    private int state;
    private double citizen;
//GETTERS
    public String getCountry() {
        return country;
    }

    public int getState() {
        return state;
    }

    public double getCitizen() {
        return citizen;
    }
   //SETTERS

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setSiticzen(double citizen) {
        this.citizen = citizen;
    }

    public Country(String country, int state, double citizen) {
        this.country = country;
        this.state = state;
        this.citizen = citizen;
    }

    public Country(String name, double sq, int people, Continents continent, int sqc, String description, String country, int state, double siticzen) {
        super(name, sq, people, continent, sqc, description);
        this.country = country;
        this.state = state;
        this.citizen = citizen;
    }

    public Country(String name, double sq, int people, Continents continent, String description, String country, int state, double siticzen) {
        super(name, sq, people, continent, description);
        this.country = country;
        this.state = state;
        this.citizen = citizen;
    }

    public Country(String name, double sq, int people, Continents continent, int sqc, String description, String country, int state) {
        super(name, sq, people, continent, sqc, description);
        this.country = country;
        this.state = state;
    }

    public Country(String name, double sq, int people, Continents continent, int sqc, String description, String country, double citizen) {
        super(name, sq, people, continent, sqc, description);
        this.country = country;
        this.citizen = citizen;
    }

    public Country(String name, double sq, Continents continent, int sqc, String description, String country, int state, double citizen) {
        super(name, sq, continent, sqc, description);
        this.country = country;
        this.state = state;
        this.citizen = citizen;
    }
    public Country(String name,double sq,Continents continent,int sqc, String country,int state, double citizen){
        super(name,sq,continent, sqc);
        this.country=country;
        this.state=state;
        this.citizen=citizen;
    }

    @Override
    public String toString() {
        return "The "+country+" with "+citizen +" million people, include "+state
                +" states. This country placed on "+sqc+" million sq on " +continent
                +". It's one of 6 others continents on big territory "+sq+" million sq of "+ name+".";
    }
}
