package homework14;

import lesson14.Colors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address address1 = new Address("882 East 14 St", "Brooklyn", "NY", 11230);
        List<Insurance_Companies> insurance = new ArrayList<>();
        insurance.add(Insurance_Companies.FIDELIS);
        insurance.add(Insurance_Companies.UNITEDHEALTHCARE);
        insurance.add(Insurance_Companies.HCSC);

        System.out.println("-----LIST OF DOCTORS-----");
        List<Doctor> stGeorge_doctors = new ArrayList<Doctor>();
        stGeorge_doctors.add(new Doctor("Paul", "Johnson", Position.CARDIOLOGIST));
        stGeorge_doctors.add(new Doctor("William", "Hunt", Position.DENTIST));
        stGeorge_doctors.add(new Doctor("Abbraham", "Lebowski", Position.PHYSICIAN));
        stGeorge_doctors.add((new Doctor("Kevin", "Andersson", Position.DERMATOLOGIST)));
        stGeorge_doctors.forEach(x -> x.printDoctors());

        System.out.println("                         ");
        System.out.println("------LIST OF ROOMS------");
        Map<Integer, Position> rooms = new HashMap<>();

        rooms.put(1, Position.ALLERGIST);
        rooms.put(2, Position.CARDIOLOGIST);
        rooms.put(3, Position.DENTIST);
        rooms.put(4, Position.ONCOLOGIST);
        rooms.put(5, Position.PEDIATRICIANS);
        rooms.put(6, Position.PHYSIATRISTS);
        rooms.put(7, Position.RADIOLOGIST);
        rooms.put(8, Position.OPHTHALMOLOGIST);

        for (Map.Entry<Integer, Position> set : rooms.entrySet()) {
            System.out.println("  ");
            System.out.print("#");
            System.out.print(set.getKey());
            System.out.print("  ");
            System.out.print(set.getValue());
            System.out.print("  ");


        }
        Hospital stGeorge = new Hospital("St.George Hospital", address1, stGeorge_doctors, rooms, insurance);
        stGeorge.printInfo();
    }
}
