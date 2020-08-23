package hw14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;

    Doctor James = new Doctor("James","Jameson",Position.CARDIOLOGIST);
    Doctor Ivan = new Doctor("Ivan","Ivanov",Position.DERMATOLOGIST);
    Doctor Susan = new Doctor("Susan","Simpson",Position.PEDIATRIC);
    Doctor Mike = new Doctor("Mike", "Pense",Position.PHYSICIAN);
    Doctor Lukas = new Doctor("Lukas","Cane",Position.SURGEON);


    private HashMap<Integer,String> rooms;

    Rooms f1 = new Rooms(1,Position.SURGEON);
    Rooms f2 = new Rooms(2,Position.PHYSICIAN);
    Rooms f3 = new Rooms(3,Position.PEDIATRIC);
    Rooms f4 = new Rooms(4,Position.DERMATOLOGIST);
    Rooms f5 = new Rooms(5,Position.CARDIOLOGIST);

    private ArrayList<Insurance> acceptedInsurances = new ArrayList<>();









    public Hospital(String hospitalName, Address address) {
        this.hospitalName = hospitalName;
        this.address = address;
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
}