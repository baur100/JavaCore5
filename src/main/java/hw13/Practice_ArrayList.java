package hw13;

import java.util.List;

public class Practice_ArrayList {
    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++ArrayOfString+++++++++++++++++++++++++");
        List<String> sports = new java.util.ArrayList<>();
        sports.add("Soccer");
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("BeerPong");

        System.out.println(sports.size());
        System.out.println(sports);

        sports.add(0,"Baseball");

        System.out.println(sports);
        sports.remove("BeerPong");
        System.out.println(sports);


        System.out.println("\n\n++++++++++++++++++++ArrayOfInt+++++++++++++++++++++++++");
        List<Integer> income = new java.util.ArrayList<>();
        income.add(1000);
        income.add(500000);
        income.add(3000);
        System.out.println(income);

        income.set(1,2000);
        System.out.println(income);
        System.out.println(income.contains(10000));

        income.forEach(x-> System.out.println(x));


        System.out.println("\n\n++++++++++++++++++++ArrayOfCustomClass+++++++++++++++++++++++++");
        BedSizes[] size = {BedSizes.Crib, BedSizes.Full, BedSizes.King};
        Bed kidsBed = new Bed("Wood", size,255, "Foam");
        Bed singleAdult = new Bed("metal", size, 0, "foam");
        Bed familyBed = new Bed();

        List<Bed> beds = new java.util.ArrayList<>();
        beds.add(kidsBed);
        beds.add(singleAdult);
        System.out.println(beds);

        beds.removeAll(beds);
        System.out.println(beds);
        beds.add(familyBed);
        beds.add(kidsBed);

        beds.forEach(x -> System.out.println(x));
    }
}
