package hw18;

public class Address {
    private String streetaddress;
    private String town;
    private String state;
    private int zip;

    public Address(String streetaddress, String town, String state, int zip) {
        this.streetaddress = streetaddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    public void printInfo(){
        System.out.println( "Address of Hospital: "+"\nStreet: "+streetaddress+"\nTown: "+town+"\nState: "+state+"\nZip: "+zip);
    }
}
