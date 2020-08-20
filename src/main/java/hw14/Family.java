package hw14;

public class Family {
    private String lastName;
    private Address address;
    private SchoolsAttended[] schools;
    private Vacation vacation;

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
}
