package homework14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {

    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, Position> rooms;
    private List<Insurance_Companies> acceptedInsurance;


    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, Position> rooms, List<Insurance_Companies> acceptedInsurance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurance = acceptedInsurance;
    }

    public Hospital() {
    }

    public void printInfo() {
        System.out.println(
                "\n          " +
                        "\n------HOSPITAL DESCRIPTION------" +
                        "\n            " +
                        "\n- Hospital name: " + hospitalName +
                        "\n- Address: " + address +
                        "\n- List of doctors: " + doctors +
                        "\n            " +
                        "\n- List of rooms: " + rooms +
                        "\n- Accepted Insurance Plans: " + acceptedInsurance);

    }
}

