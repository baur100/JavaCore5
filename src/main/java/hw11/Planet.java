package hw11;

import java.util.Arrays;

public class Planet extends Ground {
    private Continents[] continents;
    private int amountContinents;
    private Oceans[] ocean;
    private int amountOceans;

    //GETTERS
    public Continents[] getContinents() {
        return continents;
    }

    public int getAmountContinents() {
        return amountContinents;
    }

    public Oceans[] getOcean() {
        return ocean;
    }

    public int getAmountOceans() {
        return amountOceans;
    }

    //SETTERS
    public void setContinents(Continents[] NewContinents) {
        this.continents = NewContinents;
    }

    public void setAmountC(int NewAmoutC) {
        this.amountContinents = NewAmoutC;
    }

    public void setOcean(Oceans[] ocean) {
        this.ocean = ocean;
    }

    public void setAmountO(int NewAmountO) {
        this.amountOceans = NewAmountO;
    }

    //CONSTRUCTIONS
    public Planet(){

    }

    public Planet(Continents[] continents, int amountContinents, Oceans[] ocean, int amountOceans) {
        this.continents = continents;
        this.amountContinents = amountContinents;
        this.ocean = ocean;
        this.amountOceans = amountOceans;
    }

    public Planet(String name, double sq, Continents[] c, int ac, Oceans[] ocean, int ao) {
        super(name, sq);
        this.continents = c;
        this.amountContinents = ac;
        this.ocean = ocean;
        this.amountOceans = ao;
    }

    public Planet(String name, double sq, Continents[] continents, int amountContinents, Oceans[] ocean) {
        super(name, sq);
        this.continents = continents;
        this.amountContinents = amountContinents;
        this.ocean = ocean;
    }

    public Planet(String name, double sq, Continents[] continents) {
        super(name, sq);
        this.continents = continents;
    }

    public Planet(String name, double sq, Continents[] continents, int amountContinents) {
        super(name, sq);
        this.continents = continents;
        this.amountContinents = amountContinents;
    }

    public Planet(String name, double sq, Oceans[] ocean, int amountOceans) {
        super(name, sq);
        this.ocean = ocean;
        this.amountOceans = amountOceans;
    }

    public Planet(String name, double sq, Continents[] continents, Oceans[] ocean) {
        super(name, sq);
        this.continents = continents;
        this.ocean = ocean;
    }

    public Planet(String name, Oceans[] ocean) {
        super(name);
        this.ocean = ocean;
    }

    public Planet(String name, double sq) {
        super(name, sq);
    }

    public void infoPlanet() {
        System.out.println("World " + name + " has an area of "
                + sq + " square miles. And  consist of " + amountContinents
                + " continents, such as:" + Arrays.toString(continents)+
                " and "+amountOceans+" oceans, such as: " + Arrays.toString(ocean) + ".");
    }
}
