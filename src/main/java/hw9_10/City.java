package hw9_10;

public class City {

    private String street;
    private String county;
    private int population;
    private int rentPrice;

    public City(String street, String county, int population, int rentPrice) {
        this.street = street;
        this.county = county;
        this.population = population;
        this.rentPrice = rentPrice;
    }

    public City() {

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public void printCity() {

        System.out.println("I live on the street: " + street + "," + "It's a " + county + "," + "the population is " + population + "," + "I pay " + rentPrice);
    }
}
