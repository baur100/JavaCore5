package hw13;

import java.util.HashMap;
import java.util.Map;

public class Practice_HashMap {

    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++HashMapOfString+++++++++++++++++++++++++");

        Map<String,String> phone = new HashMap<>();

        phone.put("iPhone", "11 PRO");
        phone.put("Samsung", "S11");
        phone.put("Google", "Pixel");
        phone.put("HTC", "Mi9");

        System.out.println(phone);

        System.out.println("++++++++++++++++++++HashMapOfInteger+++++++++++++++++++++++++");
        Map<Integer, Integer> luckyNumbers = new HashMap<>();
        luckyNumbers.put(22,77);
        luckyNumbers.put(1,986);
        luckyNumbers.put(78,99);
        luckyNumbers.size();

        System.out.println(luckyNumbers);

        System.out.println("++++++++++++++++++++HashMapOfIntegerAndString+++++++++++++++++++++++++");
        Map<Integer, String> busMap = new HashMap<>();

        busMap.put(1, "MainSt");
        busMap.put(30, "Local");
        busMap.put(999, "New York");
        busMap.put(221, "Washington");
        System.out.println(busMap);

        busMap.replace(1,"Boston");
        System.out.println(busMap);

        busMap.remove(30);
        System.out.println(busMap);

        for(Map.Entry<Integer,String> set:busMap.entrySet()){
            System.out.println(set.getKey());
            System.out.println(set.getValue());
        }



        System.out.println("++++++++++++++++++++HashMapOfCustomClass+++++++++++++++++++++++++");

        Map <String, BedSizes> bedrooms = new HashMap<>();
        bedrooms.put("Small",BedSizes.Queen);
        bedrooms.put("Big", BedSizes.King);
        bedrooms.put("Basement", BedSizes.Full);
        bedrooms.put("Attic",BedSizes.Full );
        System.out.println(bedrooms);

        System.out.println(bedrooms.keySet());


        bedrooms.put("Small", BedSizes.Crib);
        System.out.println(bedrooms);

        System.out.println(bedrooms.getOrDefault("small",BedSizes.Crib));

        for (BedSizes bs : bedrooms.values()){
            System.out.println(bs);
        }
    }
}
