package hw14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer,Position> rooms;
    private ArrayList<Insurance> acceptedInsurances;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, Position> rooms, ArrayList<Insurance> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }


    public Hospital(){}

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

    public HashMap<Integer, Position> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, Position> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Insurance> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void setAcceptedInsurances(ArrayList<Insurance> acceptedInsurances) {
        this.acceptedInsurances = acceptedInsurances;
    }

    public void printHospital(){
        System.out.println("Hospital: "+
                "\nHospitalname='"+ hospitalName+'\''+
                "Address= "+ address.toString());
    }
    public void printDoctor(){
        for(Doctor d: doctors){
            System.out.println("\nDoctors= "+d);
        }
    }
    public void printRooms(){
        for(Integer d: rooms.keySet()){
            System.out.println(d);
        }
    }
    public void printInsurance(){
        for(Insurance i: acceptedInsurances);{
            System.out.println(i);
        }
    }



//    @Override
//    public String toString() {
//        return "\nHospital" +
//                "\nhospitalName='" + hospitalName + '\'' +
//                "\naddress=" + address +
//                "\ndoctors=" + doctors +
//                "\nrooms=" + rooms +
//                "\nacceptedInsurances=" + acceptedInsurances +
//                "\n*************************************************************";
//    }
}