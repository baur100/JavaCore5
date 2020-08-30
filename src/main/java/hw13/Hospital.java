package hw13;

import lesson11.Subjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private List<Doctor> doctor;
    private Map<Integer, String> rooms;
    private List<InsuranceCompanies> acceptedInsurances;

    public Hospital(String hospitalName, List<Doctor> doctor, Map<Integer, String> rooms, List<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.doctor = doctor;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public void printDoctor() {
        for (Doctor d : doctor) {

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

    public String printHospital() {
        return "Hospital" +
                "hospitalName" + hospitalName +
                "rooms" + rooms +
                "acceptedInsurances" + acceptedInsurances;
    }
}





