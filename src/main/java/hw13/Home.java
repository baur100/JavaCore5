package hw13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Home {
    public static void main(String[] args) {
        System.out.println("'North Shore Hospital'");
        Address hospitalAddress = new Address("993 North Sheridan Rd", "Chicago", "Illinois", 60622);
        System.out.println(hospitalAddress);
        System.out.println("____________________________________________________________");
//        -Doctor-
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alex", "Nixon", Position.CARDIOLOGIST));
        doctors.add(new Doctor("Stephen", "Douglas", Position.PEDIATRICIAN));
        doctors.add(new Doctor("Dilan", "Brinn", Position.DERMATOLOGIST));
        doctors.add(new Doctor("Karen", "Miller", Position.PULMONOLOGIST));
        doctors.add(new Doctor("Ann", "Schneider", Position.SURGEON));
        System.out.println("Doctors of Hospital:");
        doctors.forEach(d -> System.out.println(d));
        System.out.println("____________________________________________________________");
//        -Room-
        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(101, "Cardiology");
        rooms.put(102, "Oncology");
        rooms.put(103, "Pediatrics");
        rooms.put(104, "Pulmonology");
        rooms.put(105, "Surgeon");
        System.out.println("List of Doctors' Offices:");
        for (Map.Entry<Integer, String> entry : rooms.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("____________________________________________________________");
//        -Insurance-
        List<InsuranceCompanies> insurance = new ArrayList<>();
        insurance.add(InsuranceCompanies.WELLCARE);
        insurance.add(InsuranceCompanies.ANTHEM_INC);
        insurance.add(InsuranceCompanies.BLUE_CROSS_BLUE_SHIELD);
        insurance.add(InsuranceCompanies.HUMANA);
        insurance.add(InsuranceCompanies.KAISER_FOUNDATION);
        insurance.add(InsuranceCompanies.UNITED_HEALTH);
        System.out.println("Accepted Insurance Companies:");
        insurance.forEach(i -> System.out.println(i));

    }
}

