package hw14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
    private static String hospitalName;
    private static Address address;
    private static ArrayList<Doctor> doctors;
    private static HashMap<Integer,Position> rooms;
    private static ArrayList<Insurance> acceptedInsurances;

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

    public static void printHospital(){
        System.out.println("Hospital: "+
                "\nHospitalname='"+ hospitalName+'\''+
                "Address= "+ address.toString());
    }
    public static void printDoctor(){
        for(Doctor d: doctors){
            System.out.println("\nDoctors= "+d);
        }
    }
    public static void printRooms(){
        for(Map.Entry<Integer,Position> entry: rooms.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
    }
    public static void printInsurance(){
        for(Insurance i: acceptedInsurances);{
            System.out.println(acceptedInsurances);
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