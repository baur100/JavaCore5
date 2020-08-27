package HW18;

import HW14.Insurance;

import javax.print.Doc;
import javax.swing.plaf.synth.SynthMenuItemUI;
import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args) {


        Map<Integer, String> roomsHelpFirst = new HashMap<>();
        roomsHelpFirst.put(23,"Cardiology");
        roomsHelpFirst.put(45, "Dermatology");
        roomsHelpFirst.put(12, "Nursing");


        Map<Integer, String> roomsHelpAlways = new HashMap<>();

        roomsHelpAlways.put(67, "Dentistry");
        roomsHelpAlways.put(8, "Practice");



        ArrayList<InsuranceCompanies> acceptedInsuranses = new ArrayList<InsuranceCompanies>();
        acceptedInsuranses.add(InsuranceCompanies.MEDICARE);
        acceptedInsuranses.add(InsuranceCompanies.MEDICATE);
        acceptedInsuranses.add(InsuranceCompanies.UNIVERSALHEALTH);
        acceptedInsuranses.add(InsuranceCompanies.BLUECROSS);
        acceptedInsuranses.add(InsuranceCompanies.MASSHEALTH);

        System.out.println("All Insurances that are accepted");
        System.out.println(acceptedInsuranses);


        Doctor one = new Doctor("Andy", "Smith", Position.NURSE );
        Doctor two = new Doctor("Marry", "Abuzel", Position.CARDIOLOGIST);
        Doctor three = new Doctor("Abraham", "Alzh", Position.PHYSICHIAN);
        Doctor four = new Doctor("Bob", "Nudsein", Position.DENTIST);
        Doctor five = new Doctor ("Adam", "Smith", Position.PRACTICIONER);

        ArrayList<Doctor> Doctorlist = new ArrayList<Doctor>();
        Doctorlist.add(one);
        Doctorlist.add(two);
        Doctorlist.add(three);



        ArrayList<Doctor> DoctorlistSecond = new ArrayList<Doctor>();
        DoctorlistSecond.add(four);
        DoctorlistSecond.add(five);



        System.out.println("Doctors' rooms and names");
        System.out.println(one+"\n"+two+"\n"+three+"\n"+four+"\n"+five);



        Address oneAddress = new Address("12 Bulton", "Cambrigdge","MA", 73806);
        Address twoAddress = new Address("Makensy Road", "Bolton", "BE", 34234);

        Hospital HelpFirst = new Hospital("HelpFirst",oneAddress, Doctorlist, roomsHelpFirst, acceptedInsuranses);
        Hospital HelpAlways = new Hospital("HelpAlways", twoAddress, DoctorlistSecond, roomsHelpAlways, acceptedInsuranses);

        System.out.println(HelpFirst+"\n"+HelpAlways);


    }
}
