package lesson11;

public class Address {
    private String address1;
    private String address2;
    private String city;
    private String state;
    private int zip;


    public Address(String address1, String address2, String city, String state, int zip) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(String address1, String address2, String city, String state) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
    }

    public Address(String address1, String address2, String city) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
