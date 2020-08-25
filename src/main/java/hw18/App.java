package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        Address ohAddress = new Address("123Concord str", "Orlando", "Fl", 12345 );
        Address apAddress = new Address("456 Downtown ave", "Orlando", "Fl", 98765);
        Address flHealth = new Address("567 Waller cir", "Sanford", "Fl", 65478);


        Doctor ivanov = new Doctor("Ivan", "Ivanov", Position.SURGEON);
        Doctor petrov = new Doctor ("Petr", "Petrov", Position.CARDIOLOGIST);
        Doctor sidorov = new Doctor ("Semen", "Sidorov", Position.OBGYN);
        Doctor melnik = new Doctor ("Denis", "Melnik", Position.CHIROPRACTOR);
        Doctor packman = new Doctor("Andrew", "Packman", Position.PHYSICIAN);

        ArrayList<Doctor>ohDoctors = new ArrayList<>();
        ohDoctors.add (ivanov);
        ohDoctors.add (petrov);

        ArrayList <Doctor> apDoctors = new ArrayList<>();
        apDoctors.add (sidorov);
        apDoctors.add (melnik);

        ArrayList <Doctor> flDoctors = new ArrayList<>();
        flDoctors.add (packman);
        flDoctors.add (sidorov);


        HashMap<Integer,String> ohRooms = new HashMap<>();
        ohRooms.put(20, "Surgery");
        ohRooms.put(30, "Gardiology");

        HashMap<Integer,String> apRooms = new HashMap<>();
        apRooms.put (40,"Obgyn");
        apRooms.put (50, "Chiro");

        HashMap<Integer,String> flRooms = new HashMap<>();
        flRooms.put (60, "Physician");
        flRooms.put (70, "OBGYN");


        ArrayList <InsuranseCompamies> basic  = new ArrayList<>();
        basic.add (InsuranseCompamies.FLORIDABLUE);
        basic.add (InsuranseCompamies.BlUECROSS);

        ArrayList <InsuranseCompamies> extended  = new ArrayList<>();
        extended.add (InsuranseCompamies.AETNA);
        extended.add (InsuranseCompamies.MALINA);
        extended.add (InsuranseCompamies.STATEFARM);


        Hospital oh = new Hospital("Orlando Health", ohAddress, ohDoctors, ohRooms, basic);

        oh.printInfo("Orlando health");
        oh.printDoctors();
        oh.insInfo();
        oh.printRooms();














    }
}
