package HW18;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {


    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, String> rooms;
    private List<InsuranceCompanies> acceptedInsuranses;




    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranceCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public void printDoctors(){
        for(Doctor d: doctors){
            System.out.println(d.toString());
        }
    }

    public void printInsurances(){
        for(InsuranceCompanies i : acceptedInsuranses){
            System.out.println();
        }
    }

    public void printRooms (){
        for(Map.Entry<Integer, String> entry : rooms.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }


    public void printHospital() {
        System.out.println("Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address=" + address +
                ", doctors=" + doctors +
                ", rooms=" + rooms +
                ", acceptedInsuranses=" + acceptedInsuranses +
                '}');

        printDoctors();
        printRooms();
        printInsurances();
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address=" + address +
                ", doctors=" + doctors +
                ", rooms=" + rooms +
                ", acceptedInsuranses=" + acceptedInsuranses +
                '}';
    }
}
