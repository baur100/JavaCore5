package hw14;

import java.util.Arrays;

public class Kids extends Family {
    private String kidName;
    private int kidAge;

    public Kids(String lastName, Address address, SchoolsAttended[] schools, Vacation vacation, String kidName, int kidAge) {
        super(lastName, address, schools, vacation);
        this.kidName = kidName;
        this.kidAge = kidAge;
    }

    public String getKidName() {
        return kidName;
    }

    public void setKidName(String kidName) {
        this.kidName = kidName;
    }

    public int getKidAge() {
        return kidAge;
    }

    public void setKidAge(int kidAge) {
        this.kidAge = kidAge;
    }

    @Override
    public String toString() {
        return "Kids{" +
                "kidName='" + kidName + '\'' +
                ", kidAge=" + kidAge +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", schools=" + Arrays.toString(schools) +
                ", vacation=" + vacation +
                '}';
    }
}
