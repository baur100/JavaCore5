package hw14;

public class Address {
    private String street;
    private int apartment;
    private String town;
    private String county;

    public Address(String street, int apartment, String town, String county) {
        this.street = street;
        this.apartment = apartment;
        this.town = town;
        this.county = county;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
