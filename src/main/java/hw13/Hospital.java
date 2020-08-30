package hw13;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address hospitalAddress;
    private List<Doctor> doctor;
    private Map<Integer, String> rooms;
    private List<InsuranceCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address hospitalAddress, List<Doctor> doctor, Map<Integer, String> rooms, List<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.doctor = doctor;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public void printDoctor() {
        for (Doctor d : doctor) {
            System.out.println(d);

        }
    }

    public void printRooms() {
        for (Map.Entry<Integer, String> entry : rooms.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void printInsuranceCompanies() {
        for (InsuranceCompanies i : acceptedInsurances) {
            System.out.println(i);
        }
    }

    public void printHospital() {
        System.out.println("\nHospital - " + hospitalName);
        System.out.println("______________________________________________");
        System.out.println("Doctors of Hospital:");
        printDoctor();
        System.out.println("______________________________________________");
        System.out.println("List of Doctors' Offices:");
        printRooms();
        System.out.println("______________________________________________");
        System.out.println("Accepted Insurance Companies:");
        printInsuranceCompanies();

    }
}





