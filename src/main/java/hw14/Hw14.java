package hw14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hw14 {

    public static void main(String[] args) {
        Doctor James = new Doctor("James","Jameson",Position.CARDIOLOGIST);
        Doctor Ivan = new Doctor("Ivan","Ivanov",Position.DERMATOLOGIST);
        Doctor Susan = new Doctor("Susan","Simpson",Position.PEDIATRIC);
        Doctor Mike = new Doctor("Mike", "Pense",Position.PHYSICIAN);
        Doctor Lukas = new Doctor("Lukas","Cane",Position.SURGEON);
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(James);
        doctors.add(Ivan);
        doctors.add(Susan);
        doctors.add(Mike);
        doctors.add(Lukas);
        System.out.println(doctors);
        System.out.println("====================================================");










    }

}
