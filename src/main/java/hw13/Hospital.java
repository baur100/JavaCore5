package hw13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address[] address;
    private List<Doctor> doctor = new ArrayList<>();
    private Map<Integer, String> rooms;
    private List<InsuranceCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address[] address, List<Doctor> doctor, Map<Integer, String> rooms, List<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctor = doctor;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;

    }

    public void printDoctor() {
        for (Doctor d : doctor) {
            System.out.println(d);
        }
    }

//    public void printRooms() {
//        for (Map.Entry<room, Position> entry : rooms.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }

    public void printInsuranceCompanies() {
        for (InsuranceCompanies i : acceptedInsurances) {
            System.out.println(i);
        }
    }

    public void printHospital() {
        System.out.println("Hospital:" +
                "\nName - " + hospitalName +
                "\naddress - " + Arrays.toString(address));
        printDoctor();
//        printRooms();
        printInsuranceCompanies();
    }
}

