package hw14;


import org.w3c.dom.ls.LSOutput;

public class App {
    public static void main(String[] args) {

        Address parentAddress = new Address("111 Broadway cir", 58, "Melburn", "Polk");

        SchoolsAttended[] SchoolsForTim = {SchoolsAttended.FREEDOMHIGH, SchoolsAttended.CONCORDMIDDLE};

        Parents Tim = new Parents("Doe", parentAddress, SchoolsForTim, Vacation.HAWAII_2017, "Tim", 41);


//        System.out.println(Tim);

        Tim.getVacation();
        Tim.getAddress();


        Address andrewAddress = new Address("121 Milk Ave", 23, "Odessa", "Brendon");
        SchoolsAttended[] schoolsForAndrew = {SchoolsAttended.SMITHELEMENTARY};

        Kids Andrew = new Kids("Gellar", andrewAddress, schoolsForAndrew, Vacation.DENVER_2019, "Andrew", 8);
        System.out.println(Andrew);

        Andrew.getKidName();
    }
}

