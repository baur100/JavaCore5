package hw13;

import java.util.ArrayList;

public class Hw13 {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        listString.add("One");
        listString.add("Two");
        listString.add("Three");

        listString.forEach(System.out::println);

        ArrayList<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);


        listInteger.forEach(x-> System.out.println(x));

        for (Integer s:listInteger){
            System.out.println(s);
        }


    }
}
