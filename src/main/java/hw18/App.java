package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address address =new  Address ("345 Ventura blvd", "Studio city", "CA", 91603);


        Doctors doctors1 = new Doctors("Jack", "Wilson", Position.PHYSICIAN);
        Doctors doctors2 = new Doctors("Julia", "Soll", Position.NEUROLOGIST);
        Doctors doctors3 = new Doctors("Karen", "Rutunayn", Position.ENDOCRINOLOGIST);
        Doctors doctors4 = new Doctors("Ksenia", "Avtukhova", Position.PEDIATRICIAN);
        Doctors doctors5 = new Doctors("Sam", "Shultz", Position.RHEUMATOLOGIST);

        var doctorslist = new ArrayList<Doctors>();
        doctorslist.add(0, doctors1);
        doctorslist.add(1, doctors2);
        doctorslist.add(2, doctors3);
        doctorslist.add(3, doctors4);
        doctorslist.add(4, doctors5);

        var rooms = new HashMap<Integer,String>();
        rooms.put(12, "Rheumatologist");
        rooms.put(34, "Neurologist");
        rooms.put(22, "Physician");
        rooms.put(43, "Endocrinologist");
        rooms.put(11, "Pediatrician");

        for(Map.Entry<Integer, String> rm : rooms.entrySet()) {
            Integer key = rm.getKey();
            String value = rm.getValue();}

        var acceptedInshurance = new ArrayList<InshuranceCompanies>();
        acceptedInshurance.add(0,InshuranceCompanies.AETNA);
        acceptedInshurance.add(1,InshuranceCompanies.MediCal);
        acceptedInshurance.add(2,InshuranceCompanies.UnitedHealthcare);

        Hospital hospital = new Hospital("'Keiser'",address,doctorslist,rooms,acceptedInshurance);
        hospital.printInfo();
    }
}
