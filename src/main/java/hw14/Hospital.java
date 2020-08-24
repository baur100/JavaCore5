package hw14;

import javax.print.Doc;
import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class Hospital {
    public static void main(String[] args) {
        private String hospitalName;
        private ArrayList<Doctor> doctors;

        HashMap<Integer, Position> rooms = new HashMap<>();
        rooms.put(21,Position.CARDIOLOGIST);
        rooms.put(11,Position.SURGEON);
        rooms.put(31,Position.ONCOLOGIST);
        rooms.put(41,Position.PEDIATRICIAN);
        rooms.put(01,Position.THERAPIST);

                

        ArrayList<InsuranseCompanies> acceptedInsurances = new ArrayList<>();
        acceptedInsurances.add(InsuranseCompanies.Metlife);
        acceptedInsurances.add(InsuranseCompanies.AETNA);

        acceptedInsurances.forEach(x-> System.out.println(x));


        Doctor house = new Doctor("Gregory", "Hose", Position.THERAPIST);
        Doctor wilson =  new Doctor("James", "Wilson", Position.ONCOLOGIST);
        Doctor chaise = new Doctor("Robert", "Chaise", Position.SURGEON);
        Doctor foreman = new Doctor("Eric", "Foreman", Position.NEUROLOGIST);
        Doctor taub = new Doctor("Kris", "Taub", Position.SURGEON);


    }

}
