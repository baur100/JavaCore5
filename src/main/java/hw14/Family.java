package hw14;

import java.util.Arrays;

public class Family {
    protected String lastName;
    protected Address address;
    protected SchoolsAttended[] schools;
    protected Vacation vacation;

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public SchoolsAttended[] getSchools() {
        return schools;
    }

    public Vacation getVacation() {
        return vacation;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Family(String lastName, Address address, SchoolsAttended[] schools, Vacation vacation) {
        this.lastName = lastName;
        this.address = address;
        this.schools = schools;
        this.vacation = vacation;


    }

//    @Override
//    public String toString() {
//        return "Family{" +
//                "lastName='" + lastName + '\'' +
//                ", address=" + address +
//                ", schools=" + Arrays.toString(schools) +
//                ", vacation=" + vacation +
//                '}';
//    }


//    public void printParent(String name) {
//        System.out.println("Parents{" +
//                "name='" + name + '\'' +
//                ", age=" +
//                ", lastName='" + lastName + '\'' +
//                ", address=" + address +
//                ", schools=" + Arrays.toString(schools) +
//                ", vacation=" + vacation +
//                '}');
//
//    }
}
