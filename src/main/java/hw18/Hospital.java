package hw18;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {

   public static void main(String[] args) {

       String hospitalName;
       Address address;
       ArrayList<Doctor> doctors;
       HashMap<Integer, String> rooms;
       ArrayList<InsuranceCompanies> acceptedInsurances;

       Address hospitalAddress = new Address("120 S Ocean St", "Berrytown", "NY", 11235);
       hospitalAddress.printInfo();

       Doctor doctor = new Doctor("Anna", "Gerald", Position.NURSE);
       Doctor doctor2 = new Doctor("Chris", "Zeldberg", Position.PHYSICIAN);
       Doctor doctor3 = new Doctor("Nora", "Ray", Position.PODIATRIST);
       Doctor doctor4 = new Doctor("Simon", "Rodriguez", Position.SURGEON);
       doctor.printDoctors();
       doctor2.printDoctors();
       doctor3.printDoctors();
       doctor4.printDoctors();
       }
   }

