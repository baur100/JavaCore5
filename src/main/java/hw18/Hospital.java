package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalname;
    private Address address;
    private ArrayList<Doctors> doctors;
    private HashMap<Integer,String> rooms;
    private ArrayList<InshuranceCompanies> acceptedInshurance;

    public Hospital(String hospitalname, Address address, ArrayList<Doctors> doctors, HashMap<Integer, String> rooms, ArrayList<InshuranceCompanies> acceptedInshurance) {
        this.hospitalname = hospitalname;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInshurance = acceptedInshurance;
    }
    public void printInfo(){
        System.out.println("Hospital name = "+hospitalname);
        address.printInfo();
        System.out.println("Available today:");
        rooms.forEach((k,v)-> System.out.println("Room: "+k+ " - " +v));

        System.out.println("List of Doctors:");
        doctors.forEach(doc->doc.printInfoDoctors());

//        rooms.forEach((roomNumber,roomName)-> System.out.println(roomNumber+"-->"+roomName));
        System.out.println("List of accepted insurances in Hospital:");
        acceptedInshurance.forEach(v-> System.out.println(v));
    }
}
