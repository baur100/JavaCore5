package hw17;

public class Address {
    private String streetAddress;
    private String town;
    private String state;
    private int zip;

    public Address() {
    }

    public Address(String streetAddress, String town, String state, int zip) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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
    public String toString(){
       return "\n Address information:"+
               "\n Address: " +streetAddress+
               "\n Town: "+town+
               "\n State: "+state+
               "\n Zip-code: "+ zip+".";
    }
}
