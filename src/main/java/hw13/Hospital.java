package hw13;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital extends Address {
    private String hospitalName;
    private ArrayList<Doctors> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranseCompanies> acceptedInsuranses;

    // GETTERS and SETTERS
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public ArrayList<Doctors> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctors> doctors) {
        this.doctors = doctors;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<InsuranseCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(ArrayList<InsuranseCompanies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }

    //CONSTRUCTIONS
    public Hospital() {
    }

    public Hospital(String streetAddress, String town, String state, int zip, String hospitalName, ArrayList<Doctors> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranseCompanies> acceptedInsuranses) {
        super(streetAddress, town, state, zip);
        this.hospitalName = hospitalName;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public void printInfo() {
        System.out.println("====== " + hospitalName + " INFORMATION =======");
        System.out.println("Hospital name: " + hospitalName + ".");
        System.out.println("Hospital address: " + super.streetAddress + ", " + super.town + ", " + super.state + ", " + super.zip + ".");
        System.out.println("Accepted insurance companies: " + acceptedInsuranses + ".");
    }

    public void printDoctors() {
        System.out.println("====== Doctors of " + hospitalName + " INFORMATION =======");
        System.out.println(doctors);

    }
    public void printRooms(){
        System.out.println("====== Rooms of " + hospitalName + " INFORMATION =======");
        System.out.println("Number of room:"+ rooms);

    }



}
