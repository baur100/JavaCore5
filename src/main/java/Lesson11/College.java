package Lesson11;

public class College {
    public String collegeName;
    public String address;
    public String city;
    public String state;
    public int zip;

    public College(String collegeName, String address, String city, String state, int zip) {
        this.collegeName = collegeName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + collegeName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
