package hw13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Home {
    public static void main(String[] args) {
        Address hospitalAddress = new Address("993 North Sheridan Rd", "Chicago", "Illinois", 60622);
//        -Doctors-
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alex", "Nixon", Position.CARDIOLOGIST));
        doctors.add(new Doctor("Stephen", "Douglas", Position.PEDIATRICIAN));
        doctors.add(new Doctor("Dilan", "Brinn", Position.DERMATOLOGIST));
        doctors.add(new Doctor("Karen", "Miller", Position.PULMONOLOGIST));
        doctors.add(new Doctor("Ann", "Schneider", Position.SURGEON));
//        -Rooms-
        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(101, "Cardiology");
        rooms.put(102, "Oncology");
        rooms.put(103, "Pediatrics");
        rooms.put(104, "Pulmonology");
        rooms.put(105, "Surgeon");
//        -Insurance-
        List<InsuranceCompanies> insurance = new ArrayList<>();
        insurance.add(InsuranceCompanies.WELLCARE);
        insurance.add(InsuranceCompanies.ANTHEM_INC);
        insurance.add(InsuranceCompanies.BLUE_CROSS_BLUE_SHIELD);
        insurance.add(InsuranceCompanies.HUMANA);
        insurance.add(InsuranceCompanies.KAISER_FOUNDATION);
        insurance.add(InsuranceCompanies.UNITED_HEALTH);
//        -Hospital-
        Hospital ns = new Hospital("North Shore", hospitalAddress, doctors, rooms, insurance);
        ns.printHospital();
    }
}

