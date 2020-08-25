package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer,String> rooms;
    private ArrayList<InsuranseCompamies> acceptedInsuranses;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranseCompamies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<InsuranseCompamies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(ArrayList<InsuranseCompamies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }


    public String hospitalToString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address=" + address +
                ", doctors=" + doctors +
                ", rooms=" + rooms +
                ", acceptedInsuranses=" + acceptedInsuranses +
                '}';
    }

    public void insInfo () {
        acceptedInsuranses.forEach(i -> System.out.println(i));
    }

        public void printDoctors () {
            doctors.forEach(Doctor::getDoc);
        }


    public void printRooms() {
        for (Map.Entry<Integer, String> entry : rooms.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

            public void printInfo (String hospitalName) {
                System.out.println("Hospital{" +
                        "hospitalName='" + hospitalName);
                address.AddressToString();
                printDoctors();
                insInfo();


            }

    }

