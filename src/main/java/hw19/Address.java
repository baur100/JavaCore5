package hw19;

public class Address {
    private String nameOFstreet;
    private String town;
    private String state;
    private int zip;

    public Address(String nameOFstreet, String town, String state, int zip) {
        this.nameOFstreet = nameOFstreet;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public String getNameOFstreet() {
        return nameOFstreet;
    }

    public void setNameOFstreet(String nameOFstreet) {
        this.nameOFstreet = nameOFstreet;
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

    public Address() {
    }
    public void printInfo(){
        System.out.println("Address of Farm: "+"\nStreet: "+nameOFstreet+"\nTown: "+town+"\nState: "+state+"\nZip: "+zip);
    }
}
