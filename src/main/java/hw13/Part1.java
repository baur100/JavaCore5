package hw13;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Part1 {
    public static void main(String[] args) {
        ArrayList<Doctors> doctors1= new ArrayList<Doctors>();
        doctors1.add(new Doctors("Julia","Kavalsky",Position.CARDIOlOGIST));
        doctors1.add(new Doctors("Steve","Martin",Position.NEUROLOGIST));
        doctors1.add(new Doctors("Max","Sherebatov",Position.PHYSICIAN));
        doctors1.add(new Doctors("Kevin","Liff",Position.OPHTHALMOLOGIST));

        HashMap<Integer,String> rooms1= new HashMap<Integer, String>();
        rooms1.put(11,"Cardiology");
        rooms1.put(12,"Physician room");
        rooms1.put(13,"Ophthalmology room");
        rooms1.put(14,"Neurology room");


        ArrayList <InsuranseCompanies>  acceptedInsuranses1= new ArrayList<InsuranseCompanies>();
        acceptedInsuranses1.add(InsuranseCompanies.AMBETTER);
        acceptedInsuranses1.add(InsuranseCompanies.AETNA);
        acceptedInsuranses1.add(InsuranseCompanies.BEST_CARE);
        acceptedInsuranses1.add(InsuranseCompanies.FAMILY_DOCTOR);



        Hospital h1= new Hospital( "1000 S 20th Ave","Miami","FL",1111,"Hospital snt.Maria",doctors1,rooms1,acceptedInsuranses1);
        h1.printInfo();
        h1.printDoctors();
        h1.printRooms();
    }
}
