package hw13;

public class Address {
    protected String streetAddress;
    protected String town;
    protected String state;
    protected int zip;

    //GETTERS AND SETTERS
    public String getStreetAddress(){
        return streetAddress;
    }
    public void setStreetAddress(String NewStreetAddress){
        this.streetAddress=NewStreetAddress;
    }
    public String getTown(){
        return town;
    }
    public void setTown(String NewTown){
        this.town=NewTown;
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

    //CONSTRUCTIONS
    public Address(){}
    public Address(String streetAddress, String town, String state, int zip) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public Address(String streetAddress, String town, String state) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
    }

    public Address(String streetAddress, String town) {
        this.streetAddress = streetAddress;
        this.town = town;
    }

    @Override
    public String toString() {
        return "Address:" +
                "streetAddress:'" + streetAddress +
                ", town:" + town +
                ", state:" + state +
                ", zip:" + zip+".";
    }
}

