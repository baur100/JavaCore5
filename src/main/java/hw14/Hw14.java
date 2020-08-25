package hw14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hw14 {

    public static void main(String[] args) {
        ArrayList<Doctor> listDoctors = new ArrayList<>();
        Doctor James = new Doctor("James","Jameson",Position.CARDIOLOGIST);
        Doctor Ivan = new Doctor("Ivan","Ivanov",Position.DERMATOLOGIST);
        Doctor Susan = new Doctor("Susan","Simpson",Position.PEDIATRIC);
        Doctor Mike = new Doctor("Mike", "Pense",Position.PHYSICIAN);
        Doctor Lukas = new Doctor("Lukas","Cane",Position.SURGEON);

        listDoctors.add(James);
        listDoctors.add(Ivan);
        listDoctors.add(Susan);
        listDoctors.add(Mike);
        listDoctors.add(Lukas);

        HashMap<Integer,Position> rooms = new HashMap<>();
        rooms.put(101,Position.SURGEON);
        rooms.put(232,Position.PHYSICIAN);
        rooms.put(314,Position.PEDIATRIC);
        rooms.put(254,Position.DERMATOLOGIST);
        rooms.put(365,Position.CARDIOLOGIST);

        ArrayList<Insurance> listInsurance = new ArrayList<>();
        listInsurance.add(Insurance.ANTHEM);
        listInsurance.add(Insurance.CVS);
        listInsurance.add(Insurance.HUMANA);
        listInsurance.add(Insurance.UNITED);
        listInsurance.add(Insurance.KAISER);

        Address address = new Address("2545 Hollow str","Washington","DC",5412);

        Hospital hospital = new Hospital("St Jones",address,listDoctors,rooms,listInsurance);
        Hospital.printHospital();
        Hospital.printInsurance();
        Hospital.printDoctor();
        Hospital.printRooms();






















    }

}
